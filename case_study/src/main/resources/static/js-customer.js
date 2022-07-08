function info(id, name) {
    console.log(name)
    document.getElementById("idBlog").value = id;
    document.getElementById("name").innerHTML = name;
}

$(document).ready(function () {
    $("#buttonCreat").click(function (event) {
        $("#exampleModal").modal("show");
    });
    $("#creat").click(function (event) {
        let id = $('#idCustomer').val();
        let name = $('#nameInput').val();
        let email = $('#emailInput').val();
        let card = $('#Card').val();
        let Birthday = $('#Birthday').val();
        let address = $('#inputAddress2').val();
        let phone = $('#Phone').val();
        let Type = $('#Type').val();
        let Gender = $('#Gender').val();
        let newCustomer = {
            idCustomer: id,
            customerType: {
                idCustomerType: Type
            },
            nameCustomer: name,
            birthdayCustomer: Birthday,
            genderCustomer: Gender,
            idCardCustomer: card,
            phoneCustomer: phone,
            emailCustomer: email,
            addressCustomer: address

        };
        console.log(newCustomer)
        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "POST",
            data: JSON.stringify(newCustomer),
            //tên API
            url: `/restCustomer/create`,
            //xử lý khi thành công
            success: function () {
                $("#thongBao").modal("show");
                successHandler();

            }
        })
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();


    })
    $("#table").on("click", ".edit", function (event) {
        let a = $(this);
        let idCustomer = a.attr("href")
        $.ajax({
            type: "GET",
            //tên API
            url: `/restCustomer/findCustomer/${idCustomer}`,
            //xử lý khi thành công
            success: function (data) {
                console.log(data)


                document.getElementById("idCustomer").value = data.idCustomer;
                document.getElementById("nameInput1").value = data.nameCustomer;
                document.getElementById("emailInput1").value = data.emailCustomer
                document.getElementById("Card1").value = data.idCardCustomer
                document.getElementById("Birthday1").value = data.birthdayCustomer
                document.getElementById("inputAddress1").value = data.addressCustomer
                document.getElementById("Phone1").value = data.phoneCustomer
                document.getElementById("Type1").value = data.customerType.idCustomerType
                document.getElementById("Gender1").value = data.genderCustomer
                $("#exampleModal1").modal("show");
            }
        })
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();
    })
    $("#creat1").click(function (event) {
        let id = $('#idCustomer').val();
        let name = $('#nameInput1').val();
        let email = $('#emailInput1').val();
        let card = $('#Card1').val();
        let Birthday = $('#Birthday1').val();
        let address = $('#inputAddress1').val();
        let phone = $('#Phone1').val();
        let Type = $('#Type1').val();
        let Gender = $('#Gender1').val();
        let newCustomer = {
            idCustomer: id,
            customerType: {
                idCustomerType: Type
            },
            nameCustomer: name,
            birthdayCustomer: Birthday,
            genderCustomer: Gender,
            idCardCustomer: card,
            phoneCustomer: phone,
            emailCustomer: email,
            addressCustomer: address

        };
        console.log(newCustomer)
        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "POST",
            data: JSON.stringify(newCustomer),
            //tên API
            url: `/restCustomer/create`,
            //xử lý khi thành công
            success: function (data) {
                // console.log(data)
                // $("#thongBao").modal("show");
                $("#thongBao1").modal("show");
                successHandler();
            }
        })
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();

    })

})

function successHandler() {
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "GET",
        // data: JSON.stringify(newCustomer),
        //tên API
        url: `/restCustomer`,
        //xử lý khi thành công
        success: function (data) {
            // console.log(data)
            //chặn sự kiện mặc định của thẻ
            event.preventDefault();


            let content = "";
            for (let i = 0; i < data.length; i++) {
                content += getCustomer(data[i]);
            }
            document.getElementById('body').innerHTML = content;
        }
})
}


function getCustomer(temp) {
    return `<tr>
            <td>${temp.idCustomer}</td>
            <td>${temp.customerType.nameCustomerType}</td>
            <td>${temp.nameCustomer}</td>
            <td>${temp.birthdayCustomer}</td>
            <td>${temp.genderCustomer==true ? "nam":"nữ"}</td>
            <td>${temp.idCardCustomer}</td>
            <td>${temp.phoneCustomer}</td>
            <td>${temp.emailCustomer}</td>
            <td>${temp.addressCustomer}</td>
            <td><a class="edit" href="${temp.idCustomer}">edit</a></td>
            <td></td>
            <td></td>
            </tr>`;
}


