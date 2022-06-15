<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/trung" method="get">
    <div style="display: flex">
        <input name="condiment" type="checkbox" value="Lettuce" id="Lettuce">
        <label for="Lettuce">Lettuce</label>
        <input name="condiment" type="checkbox" value="Tomato">
        <label>Tomato</label>
        <input name="condiment" type="checkbox" value="Mustard">
        <label>Mustard</label>
        <input name="condiment" type="checkbox" value="Sprouts">
        <label>Sprouts</label>
    </div>
    <hr>
    <button type="submit">Save</button>
</form>
<c:if test="${condiment != null}">
    <h3>Gia vị đi kèm </h3>
    <c:forEach items="${condiment}" var="tem">
        <p>${tem}</p>
    </c:forEach>
</c:if>
</body>
</html>
