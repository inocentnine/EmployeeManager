<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改员工信息</title>
</head>
<body>
	<div style="padding:3px 2px;border-bottom:1px solid #ccc">修改员工信息</div>
	<form id="updatePage" action="${pageContext.request.contextPath }/employee_update.action" method="post">
		<table>
			<tr>
				 <td>编号:</td>
				<td><input type=number name="eid" ></input></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input type=text name="ename" ></input></td>
			</tr>
			<tr>
				<td>出生日期:</td>
				<td><input type=text name="birth" ></input></td>
			</tr>
			<tr>
				<td>住址:</td>
				<td>
                    <input type=text name="address" ></input>
				</td>
			</tr>
			<tr>
				<td>参加工作时间:</td>
				<td><input type=text name="participation_date" ></input></td>
			</tr>
            <tr>
                <td>电话:</td>
                <td>
                    <input type=text name="tele" ></input>
                </td>
            </tr>
            <tr>
                <td>技术等级:</td>
                <td><input type=text name="technical_level" ></input></td>
            </tr>
            <tr>
                <td>月薪:</td>
                <td>
                    <input type=text name="monthly_salary" ></input>
                </td>
            </tr>
			<tr>
				<td>用户名:</td>
				<td>
					<input type=text name="username" ></input>
				</td>
			</tr>
			<tr>
				<td>密码:</td>
				<td>
					<input type=text name="password" ></input>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="保存"></input></td>
			</tr>
		</table>
	</form>
</body>
</html>