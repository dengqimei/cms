<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的研修</title>
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
				<div class="conlist">
					<div class="search_result">
					<c:forEach items="${articleList }" var="article">
						<div class="art_box">
							<div class="art_img">
								<a href="toContent.action?id=${article.id }"><img src="theme/1/images/front/doc.png"></a>
							</div>
							<div class="art_txt">
								<div class="title">
									<a href="toContent.action?id=${article.id }">${article.title }</a><span class="icon_pen"></span>
								</div>
								<div class="tag_txt">
									<span>栏目名称：${category.name }</span>
								</div>
								<div class="tag_txt">
									<span>作者：${article.author }</span><span class="pl30">上传时间：${article.publishDate }</span>
								</div>
							</div>

						</div>
						</c:forEach>
						<div class="page">分页</div>
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