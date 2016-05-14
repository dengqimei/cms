<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<script>
	$(function(){
		var form = $("#addArticleForm");
		form.off();
		form.on("submit",function(){
			form.ajaxSubmit(function(){
				form[0].reset();
				alert("添加成功！");
			});
			return false;
		});
	});

</script>
<h1>信息发布</h1>
<br>
    <form action="addArticle.action" method="post" id="addArticleForm">
	            文章标题：<input type="text" name="title"><br>
	            文章作者：<input type="text" name="author"><br>
	            所属栏目：<select name="c_id">
	                <option value="">---请选中---</option>
	                <c:forEach items="${categoryList }" var="category">
	                    <option value="${category.id }">${category.name }</option>
	                </c:forEach>
	           </select><br> 
	            文章内容：<br>
	            <textarea rows="5" cols="40" name="content"></textarea><br>
	    
	    <input type="submit" value="添加">
    </form>