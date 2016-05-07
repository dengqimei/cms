<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<h1>所有栏目信息</h1>
	<hr>
	<table width="300" border="0" align="center" cellpadding="0"
	cellspacing="1">
		<tr>
			<td height="27" align="center" >id</td>
			<td height="27" align="center" >name</td>
			<td height="27" align="center" >code</td>
		</tr>
		<c:forEach items="${categoryList }" var="category" varStatus="status">
		<tr <c:if test="${status.index %2 !=0 }">style="background:green"</c:if><c:if test="${status.index %2 ==0 }">style="background:red"</c:if>>
			<td height="27" align="center"><c:out value="${category.id }"></c:out></td>
			<td height="27" align="center"><c:out value="${category.name }"></c:out></td>
			<td height="27" align="center"><c:out value="${category.code }"></c:out></td>
		</tr>
		</c:forEach>
	</table>