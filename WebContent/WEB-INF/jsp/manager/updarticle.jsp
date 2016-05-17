<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>修改信息</h1>
<br>
    <form action="updArticle.action" method="post" id="updArticleForm">
        <input  type="hidden" name="id" value="${article.id }">
	            文章标题：<input type="text" name="title" value="${article.title }"><br>
	            文章作者：<input type="text" name="author" value="${article.author }"><br>
	            所属栏目：<select name="c_id">
	                <option value="${article.c_id }">${article.name }</option>
	                <c:forEach items="${categoryList }" var="category">
	                    <option value="${category.id }">${category.name }</option>
	                </c:forEach>
	           </select><br> 
	            文章内容：<br>
	            <textarea rows="5" cols="40" name="content">${article.content }</textarea><br>
	    <input type="submit" value="修改">
    </form>
<script>
	$(function(){
		var form=$("#updArticleForm");
		form.off();
		form.on("submit",function(){
			form.ajaxSubmit(function(){
				form[0].reset;
				alert("修改成功！");
				$(".baseUI li :contains('信息管理')").trigger("click");
			});
			return false;
		});
	});
</script>