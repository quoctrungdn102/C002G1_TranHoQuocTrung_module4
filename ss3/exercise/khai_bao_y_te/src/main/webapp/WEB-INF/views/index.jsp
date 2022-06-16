<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2 style="text-align: center">Tờ khai y tế</h2>
<h4 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG ,THÔNG TIN ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ
    LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DIICHJ BỆNH TRUYỀN NHIỄM.</h4>
<h6 style="color: red; text-align: center"> Khuyến cáo : khai báo thông tin sai sẽ vi phạm pháp luật Việt Nam</h6>
<form:form action="/submit" method="post" modelAttribute="Medical">
    <div style="contain: revert">

        <div>
            HỌ tên (ghi chữ IN HOA )<br>
            <form:input cssStyle="width: 100%" path="name"/>
        </div>
        <div style="display: flex">
            <div>
                Năm sinh<br>
                <form:select cssStyle="width: 300px" path="birthDay">
                    <form:options items="${listYears}"></form:options>
                </form:select>
            </div>
            <div style="margin-left: 20%">
                Giới tính<br>
                <form:select cssStyle="width: 300px" path="gender">
                    <form:options items="${listGender}"/>
                </form:select>
            </div>
            <div style="margin-left: 14%">
                Quốc tịch<br>
                <form:select cssStyle="width: 300px" path="country">
                    <form:options items="${listCountry}"/>
                </form:select>
            </div>

        </div>
        <div>
            Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác <br>
            <form:input cssStyle="width: 100%" path="passport"/>
        </div>
        <div>
            Thông tin đi lại<br>
            <form:radiobuttons items="${lisTransport}" path="transport"/>
        </div>
        <table style="width: 100%">
            <tr>
                <td>Số hiệu phương tiện</td>
                <td>Số ghế</td>
            </tr>
            <tr>
                <td><form:input path="vehicleNumber"/></td>
                <td><form:input path="seats"/></td>
            </tr>
        </table>
        <table style="width: 100%">
            <tr>
                <td>Ngày khởi hành</td>
                <td>Ngày kết thúc</td>
            </tr>
            <tr>
                <td>
                    <form:select path="startDay">
                        <form:options items="${listDay}"/>
                    </form:select>
                    <form:select path="startMonth">
                        <form:options items="${listMonth}"/>
                    </form:select>
                    <form:select path="startYear">
                        <form:options items="${listYears}"/>
                    </form:select>
                </td>
                <td>
                    <form:select path="endDay">
                        <form:options items="${listDay}"/>
                    </form:select>
                    <form:select path="endMonth">
                        <form:options items="${listMonth}"/>
                    </form:select>
                    <form:select path="endYear">
                        <form:options items="${listYears}"/>
                    </form:select>
                </td>
            </tr>
        </table>
        <div>
            Trong 14 ngày qua anh chị có đi đến tỉnh/ thành phố nào ?<br>
            <form:textarea path="goOut"/>

        </div>
        <div style="text-align: center">
            <button style="font-size: 50px" type="submit"> Khai Báo</button>
        </div>
    </div>
</form:form>
</body>
</html>
