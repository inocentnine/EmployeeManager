<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/utilLib/bootstrap.min.css" type="text/css" media="screen" />
<title>添加员工</title>
</head>
<body>
	<div style="width: 500px;">
		<form id="addPage" action="${pageContext.request.contextPath }/employee_add.action" method="post" enctype="multipart/form-data">
		  <div class="form-group">
		    <!-- <label for="exampleInputEmail1">id</label> -->
			  <label>员工编号</label>
		    <input type=number name="eid" class="form-control" placeholder="请输入编号">
		  </div>
		  <div class="form-group">
		    <label>员工姓名</label>
		    <input type=text name="ename" class="form-control" placeholder="请输入姓名">
		  </div>
		  <div class="form-group">
		    <label>出生日期</label>
		    <input type=text name="birth" class="form-control" placeholder="请输入日期">
		  </div>
		  <div class="form-group">
		    <label>住址</label>
		    <input type=text name="address" class="form-control" placeholder="请输入住址">
		  </div>
		  <div class="form-group">
		    <label>参加工作时间</label>
		    <input type=text name="participation_date" class="form-control" placeholder="请输入参加工作时间">
		  </div>
            <div class="form-group">
                <label>电话</label>
                <input type=text name="tele" class="form-control" placeholder="请输入电话号码">
            </div>
            <div class="form-group">
                <label>技术等级</label>
                <input type=text name="technical_level" class="form-control" placeholder="请输入技术等级">
            </div>
            <div class="form-group">
                <label>月薪</label>
                <input type=text name="monthly_salary" class="form-control" placeholder="请输入月薪">
            </div>
			<div class="form-group">
				<label>用户名</label>
				<input type=text name="username" class="form-control" placeholder="请输入用户名">
			</div>
			<div class="form-group">
				<label>密码</label>
				<input type=text name="password" class="form-control" placeholder="请输入密码">
			</div>
            <button type="submit" class="btn btn-default">提交</button>
		</form>
	</div>
</body>
</html>