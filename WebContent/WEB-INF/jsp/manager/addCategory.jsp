<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script>
$(function(){
	$("#addCategoryForm").off();
	$("#addCategoryForm").on("submit",function(){
		$("#addCategoryForm").ajaxSubmit(function(){
			$("#addCategoryForm input").not(":submit").val("");
			alert("添加成功！");
		});
		return false;
	});	
});

</script>
<center>
<h1>添加栏目页面</h1>
<br>
<div>
	<form action="addCategory.action" method="post" id="addCategoryForm">
		栏目名称:<input type="text" name="name" /><br /> 
		栏目编号:<input type="text"name="code" /><br /> 
		<input type="submit" value="提交" /><br />
	</form>
</div>
</center>