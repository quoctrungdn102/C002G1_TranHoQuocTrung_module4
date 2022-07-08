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
                displayListEmployee();

            }
        })
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();


    })
    $("#table").on("click", ".edit", function (event) {

        let a = $(this)
        let idEmployee = a.attr("href")
        console.log(idEmployee)
        debugger
        $.ajax({
            type: "GET",
            //tên API
            url: `/resEmployee/findEmployee/${idEmployee}`,
            //xử lý khi thành công
            success: function (data) {
                console.log(data)
                document.getElementById("idEmployee1").value = data.idEmployee;
                document.getElementById("nameInput1").value = data.nameEmployee;
                document.getElementById("emailInput1").value = data.emailEmployee;
                document.getElementById("Card1").value = data.idCardEmployee;
                document.getElementById("Salary1").value = data.salaryEmployee;
                document.getElementById("Birthday1").value = data.birthdayEmployee;
                document.getElementById("inputAddress1").value = data.addressEmployee;
                document.getElementById("position1").value = data.position.idPosition;
                document.getElementById("Phone1").value = data.phoneEmployee;
                document.getElementById("Educations1").value = data.educationDegree.idEducation;
                document.getElementById("Divisions1").value = data.division.idDivision;
                $("#exampleModal3").modal("show");
                displayListEmployee();
            },
            error: function () {
                console.log("lỗi")
            }
        })
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();
    })
    $("#edit").click(function (event) {
        let id = $('#idEmployee1').val();
        let name = $('#nameInput1').val();
        let email = $('#emailInput1').val();
        let card = $('#Card1').val();
        let Birthday = $('#Birthday1').val();
        let address = $('#inputAddress1').val();
        let phone = $('#Phone1').val();
        let Salary = $('#Salary1').val();
        let position = $('#position1').val();
        let Educations = $('#Educations1').val();
        let Divisions = $('#Divisions1').val();
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
                displayListEmployee();
            }
        })
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();


    })

})
function  displayListEmployee() {
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "GET",
        // data: JSON.stringify(newCustomer),
        //tên API
        url: `/resEmployee`,
        //xử lý khi thành công
        success: function (data) {
            // console.log(data)
            //chặn sự kiện mặc định của thẻ
            event.preventDefault();


            let content = "";
            for (let i = 0; i < 5; i++) {
                content +=`<tr><td>${i+1}</td>`+ getEmployee(data[i]);
            }
            document.getElementById('body').innerHTML = content;
        }
    })


}
function getEmployee(temp) {
    return `
            <td>${temp.nameEmployee}</td>
            <td>${temp.birthdayEmployee}</td>
            <td>${temp.idCardEmployee}</td>
            <td>${temp.salaryEmployee}</td>
            <td>${temp.phoneEmployee}</td>
            <td>${temp.emailEmployee}</td>
            <td>${temp.addressEmployee}</td>
            <td>${temp.position.namePosition}</td>
            <td>${temp.educationDegree.nameEducation}</td>
            <td>${temp.division.nameDivision}</td>
            <td><a class="edit" href="${temp.idEmployee}"><button>Edit</button></a></td>
            <td><a class="edit" href="${temp.idEmployee}"><button>Delete</button></a></td>
            </tr>`;
}





