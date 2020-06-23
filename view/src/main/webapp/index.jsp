<!DOCTYPE html>

<%@ page import="by.nikita.entities.UserInfo"%>
<%@ page import="by.nikita.entities.CarInfo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<fmt:setLocale value="${sessionScope.locale}" />
<fmt:setBundle basename="translations" var="messages" />

<html lang="en" dir="ltr">
<head>
<title>Cars</title>

<meta charset="UTF-8">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="styles/layout.css" type="text/css">
<!--[if lt IE 9]><script src="scripts/html5shiv.js"></script><![endif]-->
</head>

<c:set var="today" scope="page" value="${requestScope.currentDate}" />

<body>
	<div class="wrapper row1">
		<header id="header" class="clear">
			<div id="hgroup">
				<h1>
					<a href="#">Car Info</a>
				</h1>
				<c:if test="${sessionScope.LoggedUser!=null}">
				<h2>Legendary sedans of 90s</h2>
				</c:if>
			</div>
			<nav>
				<ul>
					<jsp:useBean id="userinfo" class="by.nikita.entities.UserInfo"></jsp:useBean>
					<jsp:setProperty property="*" name="userinfo" />

					<li>Hello <c:out value="${sessionScope.LoggedUser}"
							default="Guest!"></c:out></li>
					<c:choose>
						<c:when test="${sessionScope.LoggedUser!=null}">
							<li class="last">Today is <c:out value="${today}" /></li>
						</c:when>
						<c:otherwise>
							<li class="last"></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</nav>
		</header>
	</div>
	<!-- content -->
	<div class="wrapper row2">
		<div id="container" class="clear">
			<!-- content body -->
			<section id="slider">
				<c:if test="${sessionScope.LoggedUser==null}">
					<form action="in" method="post">
					<div class="form-row">
						<div class="col">
							<fmt:message key="login.username" bundle="${messages}" />
							: <input type="text" name="username" placeholder="Type here your Username"><br />
						</div>
						<div class="col">
							<fmt:message key="login.password" bundle="${messages}" />
							: <input type="password" name="password" placeholder="Type here your Password"><br />
						</div>
						<div>
							<input type="submit"
								value="<fmt:message key="login.submit" bundle="${messages}" />">
						</div>
						</div>
					</form>
				</c:if>
			</section>
			<!-- main content -->
			<c:forEach var="carInfo" items="${requestScope.cars}">
				<section id="services" class="clear">
					<article>
						<h2>${carInfo.header}</h2>
						<img src="${carInfo.imgUrl}" width="450" height="337" alt="">
						<p>${carInfo.text}</p>
						<footer class="more">
							<a href="/details/${carInfo.id}">Read More &raquo;</a>
						</footer>
					</article>
					<br />
				</section>
			</c:forEach>
			<!-- ########################################################################################## -->
			<!-- ########################################################################################## -->
			<!-- ########################################################################################## -->
			<!-- ########################################################################################## -->
			<section class="last clear">
				<article class="two_third">
					<h2>Lorum ipsum dolor</h2>
					<p>
						This is a W3C compliant free website template from <a
							href="https://www.os-templates.com/"
							title="Free Website Templates">OS Templates</a>. For full terms
						of use of this template please read our <a
							href="https://www.os-templates.com/template-terms">website
							template licence</a>.
					</p>
					<p>
						You can use and modify the template for both personal and
						commercial use. You must keep all copyright information and credit
						links in the template and associated files. For more HTML5
						templates visit <a href="https://www.os-templates.com/">free
							website templates</a>.
					</p>
					<footer class="more">
						<a href="#">Read More &raquo;</a>
					</footer>
				</article>
				<article class="one_third lastbox">
					<h2>Lorum ipsum dolor</h2>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nunc non diam erat. In fringilla massa ut nisi ullamcorper
						pellentesque. Quisque non luctus sem.</p>
					<footer class="more">
						<a href="#">Read More &raquo;</a>
					</footer>
				</article>
			</section>
			<!-- / content body -->
		</div>
	</div>
	<!-- footer -->
	<div class="wrapper row3">
		<footer id="footer" class="clear">
			<p class="fl_left">Copyright &copy; 2020 - All Rights Reserved</p>
		</footer>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>
