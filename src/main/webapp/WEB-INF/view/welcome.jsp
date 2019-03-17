<%--
  Created by IntelliJ IDEA.
  User: Таня
  Date: 10.02.2019
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Hotel reservation</title>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/css/bootstrap.css"/>"/>
    <script src="<c:url value="/resources/js/jquery-3.2.1.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.js"/>"></script>

</head>

<body>
<div class="container-fluid">
    <div class="row">
        <div class="navbar navbar-inverse">
            <div class="container">
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="<c:url value="registration"/>">Registration</a></li>
                        <li><a href="<c:url value="login"/>">Log in</a></li>
                        <li><a href="<c:url value="/admin/addHotel"/>">Add hotel</a></li>
                        <li><a href="<c:url value="/admin/addRoom"/>">Add room</a></li>
                        <li><a href="<c:url value="/user/mainPage"/>">User page</a></li>
                        <li><a href="<c:url value="/user/orderPage"/>">Make order</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="row">
    <div class="col-md-5 col-lg-5 col-sm-5 col-xs-5"></div>
    <div style="text-align: center;">
    </div>
</div>>
</body>
</html>