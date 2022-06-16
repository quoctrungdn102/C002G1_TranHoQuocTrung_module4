<%--
  Created by IntelliJ IDEA.
  User: Quoc Trung
  Date: 6/16/2022
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2">
    <tr>
        <td>Họ tên</td>
        <td>${medical.name}</td>
    </tr>
    <tr>
        <td>Năm sinh</td>
        <td>${medical.birthDay}</td>
    </tr>
    <tr>
        <td>Giới tính</td>
        <td>${medical.gender}</td>
    </tr>
    <tr>
        <td>Quốc tịch</td>
        <td>${medical.country}</td>
    </tr>
    <tr>
        <td>Hộ chiếu</td>
        <td>${medical.passport}</td>
    </tr>
    <tr>
        <td>Phương tiện</td>
        <td>${medical.transport}</td>
    </tr>
    <tr>
        <td>Số hiệu phương tiện</td>
        <td>${medical.vehicleNumber}</td>
    </tr>
    <tr>
        <td>Số ghế</td>
        <td>${medical.seats}</td>
    </tr>

    <tr>
        <td>Ngày Bắt Đầu</td>
        <td>${medical.startDay}/${medical.startMonth}/${medical.startYear}</td>
    </tr>

    <tr>
        <td>Ngày kết thúc</td>
        <td>${medical.endDay}/${medical.endMonth}/${medical.endYear}</td>
    </tr>

    <tr>
        <td>Các thành phố đã đi</td>
        <td>${medical.goOut}</td>
    </tr>
</table>

</body>
</html>
