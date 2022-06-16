<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/setting" method="post" modelAttribute="setting">


    <table>
        <tr>
            <td>Languages</td>
            <td>
                <form:select path="language">
                    <form:option value="English">English </form:option>
                    <form:option value="Vietnamese">Vietnamese</form:option>
                    <form:option value="Japanese">Japanese</form:option>
                    <form:option value="Chinese">Chinese</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Page Size :</td>
            <td>ShowSignature
                <form:select path="pageSize">
                    <form:option value="5">5 </form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="25">25</form:option>
                </form:select>
                email per page
            </td>
        </tr>
        <tr>
            <td>Spams filter</td>
            <td>
                <form:checkbox path="spamsFilter"/>Enable spams
            </td>
        </tr>
        <tr>
            <td>Signature</td>
            <td><form:textarea  path="Signature"/></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">update</button>
                <button type="reset">cancel</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
