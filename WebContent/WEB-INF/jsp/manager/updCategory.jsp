<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script>
$(function(){
	var form=$("#updCategoryForm");
	form.off();
	form.on("submit",function(){
		form.ajaxSubmit(function(){
			form[0].reset;
			alert("添加成功！");
			$(".baseUI li :contains('栏目管理')").trigger("click");
		});
		return false;
	});	
});

</script>
<center>
<h1>添加栏目页面</h1>
<br>
<div>
	<form action="updCategory.action" method="post" id="updCategoryForm">
	    <input type="hidden" name="id" value="${category.id }">
		栏目名称:<input type="text" name="name" value="${category.name }" /><br /> 
		栏目编号:<input type="text"name="code" value="${category.code }" /><br /> 
		<input type="submit" value="提交" /><br />
	</form>
</div>
</center>