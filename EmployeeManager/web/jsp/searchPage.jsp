<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/utilLib/bootstrap.min.css" type="text/css" media="screen" />
    <title>员工查询</title>
</head>
<body>
<div class="container" style="width: 100%;">
    <%--标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1 style="text-align: center;">员工查询</h1>

        </div>
    </div>
    <%--查询行--%>
    <div class="row" style="text-align: center">
        <div class="col-md-12">
            <form class="form-inline" action="${pageContext.request.contextPath }/employee_findByUsername.action" method="post">
                <label>员工姓名:</label>&nbsp;&nbsp;<input class="form-control" type="text" name="ename">&nbsp;&nbsp;
                <label>员工用户名:</label>&nbsp;&nbsp;<input class="form-control" type="text" name="username">&nbsp;&nbsp;
                <input class="btn btn-default" type="submit" value="查询" style="cursor:hand">
            </form>
        </div>
    </div>
</div>
</body>
</html>