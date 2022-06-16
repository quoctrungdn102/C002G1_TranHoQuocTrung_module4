<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<a href="/update">Update setting</a>
<table>
    <tr>
        <td>Languages</td>
        <td>
            ${setting.language}
        </td>
    </tr>
    <tr>
        <td>Page Size :</td>
        <td> ${setting.pageSize}</td>
    </tr>
    <tr>
        <td>Spams filter</td>
        <td>
            ${setting.spamsFilter ? 'Enable spams filter ' : 'Non enable spams filter'}
        </td>
    </tr>
    <tr>
        <td>Signature</td>
        <td> ${setting.signature}</td>
    </tr>
</table>
</body>
</html>
