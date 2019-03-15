<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>AddHotel</title>
</head>
<button type="button" name="back" onclick="history.back()">back</button>
<body>
<h1>
    Adding hotel
</h1>
<form:form method="POST" modelAttribute="hotelForm">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="city">City</form:label></td>
            <td><form:input path="city"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>