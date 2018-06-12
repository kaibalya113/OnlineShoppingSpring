<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/assects/css" />
<spring:url var="js" value="/assects/js" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage - ${title}</title>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>


	<!-- Page Content -->
	<c:if test="${userclick == true}">
		<%@include file="home.jsp"%>
	</c:if>

	<!-- about -->
	<c:if test="${userclickabout == true}">
		<%@include file="about.jsp"%>
	</c:if>

	<!-- contact -->
	<c:if test="${userclickcontact == true}">
		<%@include file="contact.jsp"%>
	</c:if>

	<!-- products -->
	<c:if test="${userclickproducts == true}">
		<%@include file="products.jsp"%>
	</c:if>
	
	<!-- listproducts -->
	<c:if test="${userclickallproducts == true}">
		<%@include file="listproducts.jsp"%>
	</c:if>
	
	<!-- listproductscataory -->
	<c:if test="${userclickcatagoryproducts == true}">
		<%@include file="listproducts.jsp"%>
	</c:if>




	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>

</body>

</html>
