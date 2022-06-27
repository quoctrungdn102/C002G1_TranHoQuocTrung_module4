package com.codegym.ss8.controller;

import com.codegym.ss8.model.Book;
import com.codegym.ss8.model.User;
import com.codegym.ss8.service.IBookService;
import com.codegym.ss8.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private IUserService iUserService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/display")
    public String home(Model model) {
        List<Book> list = iBookService.bookList();
        model.addAttribute("list", list);
        return "list-book";
    }

    @GetMapping("/borrow/{id}")
    public String borrowBook(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        Book book = iBookService.findById(id).get();
        if (book.getAmount() <= 0) {
            return ex();
        } else {
            book.setAmount(book.getAmount() - 1);
            iBookService.save(book);
            Integer codeBook = (int) Math.floor((Math.random() * 89999) + 10000);
            User user = new User(book, codeBook);
            // Lưu xuống user
            iUserService.saveUser(user);
            redirectAttributes.addFlashAttribute("codeBook", codeBook);
        }
        return "redirect:/display";

    }

    @GetMapping("/listBorrow")
    public String lisBorrow(Model model) {
        model.addAttribute("list", iUserService.userList());
        return "list-borrow";
    }

    @GetMapping("/returnBook")
    public String returnBook(@RequestParam("codeBook") Integer codeBook, Model model) {
        List<User> list = iUserService.userList();
        for (User temp : list) {
            if (temp.getCodeBook().equals(codeBook)) {
                iUserService.remove(temp);
                Book book = iBookService.findById(temp.getBook().getIdBook()).get();
                book.setAmount(book.getAmount() + 1);
                iBookService.save(book);
                model.addAttribute("mes", "bạn đã trả sách thành công ");
                return "home";
            }
        }
        model.addAttribute("mes", "mã sách của bạn không đúng");
        return "home";
    }

    @ExceptionHandler(Exception.class)
    public String ex() {
        return "error";
    }

    public String ex1() {
        return "error";
    }


}
