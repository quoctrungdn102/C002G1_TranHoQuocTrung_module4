package controller_all.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    public double Calculator(String calculator, double num1, double num2) {
        double result = 0;
        switch (calculator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
