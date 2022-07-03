function info(id, name) {
    console.log(name)
    document.getElementById("idBlog").value = id;
    document.getElementById("name").innerHTML = name;
}

$(document).ready(function () {
    $("#buttonCreat").click(function (event) {
        $("#exampleModal2").modal("show");
    });

    $("#creat").click(function (event) {
        let id = $('#idEmployee').val();
        let name = $('#nameInput').val();
        let email = $('#emailInput').val();
        let card = $('#Card').val();
        let Birthday = $('#Birthday').val();
        let address = $('#inputAddress2').val();
        let phone = $('#Phone').val();
        let Salary = $('#Salary').val();
        let position = $('#position').val();
        let Educations = $('#Educations').val();
        let Divisions = $('#Divisions').val();
        let newEmployee = {
            idEmployee: id,
            nameEmployee: name,
            birthdayEmployee: Birthday,
            idCardEmployee: card,
            salaryEmployee: Salary,
            phoneEmployee: phone,
            emailEmployee: email,
            addressEmployee: address,
            position: {
                idPosition: position
            },

            educationDegree: {
                idEducation: Educations
            },

            division: {
                idDivision: Divisions
            }

        };
        console.log(newEmployee)
        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "POST",
            data: JSON.stringify(newEmployee),
            //tên API
            url: `/resEmployee/create`,
            //xử lý khi thành công
            success: function () {
                $("#thongBao").modal("show");
            }
        })
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();


    })
    $("#table").on("click", ".edit", function (event) {
        let a = $(this)
        let idEmployee = a.attr("href")
        $.ajax({
            type: "GET",
            //tên API
            url: `/resEmployee/findEmployee/${idEmployee}`,
            //xử lý khi thành công
            success: function (data) {
                $("#exampleModal2").modal("show");
                //
                // document.getElementById("idEmployee").value = data.idEmployee;
                // document.getElementById("nameInput").value = data.nameEmployee;
                // document.getElementById("emailInput").value = data.emailEmployee;
                // document.getElementById("Card").value = data.idCardEmployee;
                // document.getElementById("Salary").value = data.salaryEmployee;
                // document.getElementById("Birthday").value = data.birthdayEmployee;
                // document.getElementById("inputAddress2").value = data.addressEmployee;
                // document.getElementById("position").value = data.position.idPosition;
                // document.getElementById("Phone").value = data.phoneEmployee;
                // document.getElementById("Educations").value = data.educationDegree.idEducation;
                // document.getElementById("Divisions").value = data.division.idDivision;

            },
            error: function () {
                console.log("lỗi")
            }
        })
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();

    })
})




