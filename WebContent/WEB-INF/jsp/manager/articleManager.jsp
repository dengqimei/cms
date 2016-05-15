<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <style>
        th{
            background:lightgreen;
            font-size:16px;
            font-family:微软雅黑;
        }
        td{
            font-size:14px;
            font-family:微软雅黑;
            text-align:center;
        }
    </style>
    <h1>所有文章信息</h1>
<div>
	<table border="1" style=" border-collapse:collapse; width:100%;">
		<tr>
			<th>编号</th>
			<th>标题</th>
			<th>作者</th>
			<th>发布时间</th>
			<th>点击次数</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${articleList }" var="article" varStatus="status">
		<tr <c:if test="${status.index %2 !=0 }">style="background:lightblue"</c:if>
		<c:if test="${status.index %2 ==0 }">style="background:lightyellow"</c:if>>
			<td><input type="checkbox" value=${article.id }></td>
			<td width="40%">${article.title }</td>
			<td>${article.author }</td>
			<td>${article.publishDate }</td>
			<td>${article.clickTimes }</td>
			<td>
			    <a href="javascript:void(0)" val="${article.id }" class="upd">修改</a>
			    <a href="javascript:void(0)" val="${article.id }" class="del">删除</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</div>
<script>
$(function(){
	$(".del").off();
	$(".del").on("click",function(){
		var flag = confirm("确定删除吗？");
		if(flag){
		    var id = $(this).attr("val");
		    $.post("delArticle.action",{id:id},function(){
			    $(".baseUI li :contains('信息管理')").trigger("click");
			    alert("删除成功");
		    });
		}
	});	
});

$(function(){
	$(".upd").off();
	$(".upd").on("click",function(){
		var id=$(this).attr("val");
		$.post("toUpdArticle.action",{id:id},function(){
			$(".right").load("toUpdArticle.action",{id:id});
		});
	});
});
</script>