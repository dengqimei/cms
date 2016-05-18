<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<div class="logo_sign">
			<a href="toIndex.action"><div class="logo"></div></a>
			<div class="sign">
				<span>欢迎您系统管理员</span>
				<span class="sp_home">首页</span> 
				<span class="sp_backstage"><a href="manager/toIndex.action">后台管理</a></span>
				<span class="sp_signout">退出</span>
			</div>
		</div>
		<div class="nav">
			<ul class="navUI">
			<!--  
			<s:iterator value="categoryList" var="list">
				<li><a href="toIndex.action">${list.name }</a></li>
		    </s:iterator>
		    -->
		    <li><a href="toIndex.action">首页</a></li>
		    <c:forEach items="${categoryList }" var="category" begin="1" end="9">
				<li><a href="toList.action?id=${category.id }">${category.name }</a></li>
		    </c:forEach>

			</ul>
		</div>