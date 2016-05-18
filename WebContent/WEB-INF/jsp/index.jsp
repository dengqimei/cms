<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="theme/1/css/common.css">
<link rel="stylesheet" type="text/css"
	href="theme/1/css/front/style.css">
</head>
<body>
	<div id="main">
		<div class="top">
			<div class="topbg">
				<div class="top">
					<div class="topbg">
						<jsp:include page="header.jsp"></jsp:include>
					</div>
				</div>
				<!-- 
				<div class="banner">
					<div class="banimg">
						<img src="theme/1/images/front/banner.png">
					</div>
				</div>
				 -->
			</div>
		</div>
		<div class="content">
			<div class="congw">
				<div class="clear"></div>
				<div class="box">
						<div class="box_b">
							<div class="title">
								<span class="txt_title">${category1.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category1.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList1 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
						
						<div class="box_b">
							<div class="title">
								<span class="txt_title">${category2.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category2.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList2 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
						
						<div class="box_b">
							<div class="title">
								<span class="txt_title">${category3.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category3.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList3 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
				</div>

				<div class="box">
						<div class="box_f">
							<div class="title">
								<span class="txt_title">${category4.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category4.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList4 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
						<div class="box_f">
							<div class="title">
								<span class="txt_title">${category5.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category5.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList5 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
						
						<div class="box_f">
							<div class="title">
								<span class="txt_title">${category6.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category6.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList6 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
				</div>
				
				<div class="box">
						<div class="box_f">
							<div class="title">
								<span class="txt_title">${category7.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category7.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList7 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
						<div class="box_f">
							<div class="title">
								<span class="txt_title">${category8.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category8.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList8 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
						
						<div class="box_f">
							<div class="title">
								<span class="txt_title">${category9.name }</span> <span
									class="txt_discipline">作者</span> <span class="txt_time"><a
									href="toList.action?id=${category9.id }">更多>></a></span>
							</div>
							<div class="cont">
								<ul class="discipUI">
									<c:forEach items="${articleList9 }" var="article" begin="0"
										end="5">
										<li><a href="toContent.action?id=${article.id }"
											class="txt_title">${article.title }</a><span
											class="txt_discipline">${article.author }</span><span
											class="txt_time">${article.publishDate }</span></li>
									</c:forEach>
								</ul>
							</div>
						</div>
				</div>

				<div class="link">
					<div class="linelink">
						<span>友情链接：</span>
						<a href="http://news.sina.com.cn/">新浪新闻</a>
						<a href="http://mini.eastday.com/">头条新闻</a>
						<a href="http://news.ifeng.com/">凤凰新闻</a>
						<a href="http://www.huanqiu.com/">环球新闻</a>
						<a href="http://www.xinhuanet.com/">新华网</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>