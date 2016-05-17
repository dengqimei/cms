<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详情页</title>
<link rel="stylesheet" type="text/css" href="theme/1/css/common.css">
<link rel="stylesheet" type="text/css"
	href="theme/1/css/front/style.css">
</head>
<body>
	<div id="main">
		<div class="top">
			<div class="topbg">
				<jsp:include page="header.jsp"></jsp:include>
			</div>
		</div>
		<div class="content">
			<div class="congw">
				<div class="conarticle">
					<div class="position">
						<span class="poshome">您现在的位置：</span> <a href="toIndex.action">首页</a> >> <a
							href="toList.action?id=${article.c_id }">${article.name }</a>
					</div>
					<div class="title">${article.title }</div>
					<div class="abstract">
						<span>更新时间：${article.publishDate }</span> <span>发布人：${article.author }</span>
						<span>点击${article.clickTimes }次</span>
					</div>
					<div class="details">
						<p>${article.content }</p>
					</div>
				</div>
				<div class="link">
					<div class="linelink">
						<span>友情链接：</span><a href="javascript:void(0)">上海教育网</a><a
							href="javascript:void(0)">上海教育网</a><a href="javascript:void(0)">上海教育网</a><a
							href="javascript:void(0)">上海教育网</a><a href="javascript:void(0)">上海教育网</a><a
							href="javascript:void(0)">上海教育网</a>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>