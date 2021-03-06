<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    table tr{
        height:30px;
    }
</style>
    <form action="updArticle.action" method="post" id="updArticleForm">
    <table style="border-collapse: collapse; width: 100%;">
		<caption style="font-size:24px;">修改新闻</caption>
		<tr>
			<td width="70px">文章标题：</td>
			<td>
			    <input type="hidden" name="id" value="${article.id }">
			    <input type="text" name="title" value="${article.title }">
			</td>
		</tr>
		<tr>
			<td>文章作者：</td>
			<td><input type="text" name="author" value="${article.author }"></td>
		</tr>
		<tr>
			<td>所属栏目：</td>
			<td><select name="c_id">
					<option value="${article.c_id }">${category.name }</option>
					<c:forEach items="${categoryList }" var="category">
						<option value="${category.id }">${category.name }</option>
					</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td>文章内容：</td>
			<td><textarea rows="5" cols="60" name="content">${article.content }</textarea></td>
		</tr>
		<tr>
			<td><input type="submit" value="修改"></td>
		</tr>
	</table>
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