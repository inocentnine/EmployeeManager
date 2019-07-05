<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示员工</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/utilLib/bootstrap.min.css" type="text/css" media="screen" />
<script type="text/javascript">
	function del() {
	    var msg = "您确定要删除吗？";
	    if (confirm(msg) == true) {
	        return true;
	    } else {
	        return false;
	    }
	}
</script>
<style type="text/css">
	.table th{
		text-align: center;
	}
</style>
</head>
<body>
	<div class="container" style="width: 100%;">
        <%--标题--%>
        <div class="row">
            <div class="col-md-12">
                <h1 style="text-align: center;">员工信息</h1>

            </div>
        </div>
            <%--查询行--%>
         <div class="row" style="text-align: center">
             <div class="col-md-12">
                 <form class="form-inline" action="${pageContext.request.contextPath }/employee_findByUsername.action" method="post">
					 <label>员工姓名:</label>&nbsp;&nbsp;<input class="form-control" type="text" name="ename">&nbsp;&nbsp;
                     <label>员工用户名:</label>&nbsp;&nbsp;<input class="form-control" type="text" name="username">&nbsp;&nbsp;
                     <input class="btn btn-default" type="submit" value="查询" style="cursor:hand">
					 <%--<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath }/employee_add.action">
                         <span class="glyphicon glyphicon-zoom-in" ></span>
                         添加员工
                     </a>--%>
                 </form>
             </div>
         </div>
		<%--表格--%>
		<div class="row" style="text-align: center">
	      <div class="col-md-12">
	          <table class="table table-bordered table-hover">
	              <tr>
	                  <th>员工编号</th>
					  <th>员工姓名</th>
					  <th>出生日期</th>
					  <th>住址</th>
					  <th>参加工作时间</th>
					  <th>电话</th>
                      <th>技术等级</th>
                      <th>月薪</th>
					  <th>用户名</th>
					  <th>操作</th>
	              </tr>
	                 <c:forEach items="${list}" var="employee" >
	                  <tr>                  
	                      <th>${employee.eid }</th>
						  <th>${employee.ename }</th>
						  <th>${employee.birth }</th>
						  <th>${employee.address}</th>
						  <th>${employee.participationDate}</th>
						  <th>${employee.tele }</th>
                          <th>${employee.technicalLevel}</th>
                          <th>${employee.monthlySalary }</th>
						  <th>${employee.username}</th>
	                      <th>
	                          <a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath }/employee_updatePage.action?eid=${emp.eid}">
	                              <span class="glyphicon glyphicon-pencil" ></span>  修改
	                          </a>
	                          <a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath }/employee_delete.action?eid=${emp.eid}" onclick="del()">
	                              <span class="glyphicon glyphicon-trash" ></span>  删除
	                          </a> 
	                          
	                      </th>
	                  </tr>
	              </c:forEach>
	          </table> 
	       </div>
		</div>
	</div>
</body>
</html>