function info(id, name) {
    console.log(name)
    document.getElementById("idBlog").value = id;
    document.getElementById("name").innerHTML = name;
}

$(document).ready(function () {
    $("#buttonCreat").click(function (event) {
        $("#exampleModal2").modal("show");
    });
$("#creat").click( function (event) {
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
        idCustomer : id,
        customerType: {
            idCustomerType : Type
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
        }
    })
    //chặn sự kiện mặc định của thẻ
    event.preventDefault();


})
$("#table").on("click",".edit",function (event) {
    let a = $(this);
    let idCustomer = a.attr("href")
    $.ajax({
        type: "GET",
        //tên API
        url: `/restCustomer/findCustomer/${idCustomer}`,
        //xử lý khi thành công
        success: function (data) {
            $("#exampleModal2").modal("show");

            document.getElementById("idCustomer").value = data.idCustomer;
            document.getElementById("nameInput").value = data.nameCustomer;
            document.getElementById("emailInput").value = data.emailCustomer
            document.getElementById("Card").value = data.idCardCustomer
            document.getElementById("Birthday").value = data.birthdayCustomer
            document.getElementById("inputAddress2").value = data.addressCustomer
            document.getElementById("Phone").value = data.phoneCustomer
            document.getElementById("Type").value = data.customerType.idCustomerType
            document.getElementById("Gender").value = data.genderCustomer
        }
    })
    //chặn sự kiện mặc định của thẻ
    event.preventDefault();

})
})




