<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<html>
<head>
    <title>AddRoom</title>
</head>
<button type="button" name="back" onclick="history.back()">back</button>
<body>
<h1>
    Adding hotel
</h1>
<form:form method="POST" modelAttribute="roomForm">
    <table>
        <tr>
            <td><form:label path="number">Number</form:label></td>
            <td><form:input path="number"/></td>
        </tr>
        <tr>
            <td><form:label path="roominess">Roominess</form:label></td>
            <td><form:input path="roominess"/></td>
        </tr>
        <tr>
            <td><form:label path="pricePerDay">PricePerDay</form:label></td>
            <td><form:input path="pricePerDay"/></td>
        </tr>
        <tr>
            <td><form:label path="hotel">Hotel</form:label></td>
            <td><form:select path="hotel">
                <c:forEach items="${hotels}" var="hotelVar">
                    <form:option value="${hotelVar.id}">${hotelVar.name}</form:option>
                </c:forEach>
            </form:select>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
