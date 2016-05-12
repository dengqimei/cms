<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<script>
$(function(){
	$("#addArticleForm").off();
	$("#addArticleForm").on("submit",function(){
		$("#addArticleForm").ajaxSubmit(function(){
			$("#addArticleForm input").not(":submit").val("");
			$("#addArticleForm textarea").val("");
			alert("添加成功！");
		});
		return false;
	});	
});

</script>
<h1>信息发布</h1>
<br>
    <form action="addArticle.action" method="post" id="addArticleForm">
	            标题：<input type="text" name="title"><br>
	            作者：<input type="text" name="author"><br>
	            内容：<br>
	            <textarea rows="5" cols="40" name="content"></textarea><br>
	    
	             学科：<input type="text" name="course"><br>
	             时间：<input type="text" name="date"><br>
	    <input type="submit" value="添加">
    </form>