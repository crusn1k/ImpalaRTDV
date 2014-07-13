<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 	.errors{
 		font-family: Arial;
 		font-size: 9pt;
 		color: red;
 	}
</style>
</head>
<body>
	Hello <strong>${name }</strong>
	<a href="<c:url value="logout"/>">logout</a>
	<form:form id="form" method="post" modelAttribute="model">             
    <form:input path="lolId" />     
    <form:errors path="lolId" class="errors"  />
    <form:input path="lolName" />     
    <form:errors path="lolName" class="errors"  />
    <form:input path="lolDesc" />     
    <form:errors path="lolDesc" class="errors"  />
    <button type="submit" class="btn">Submit</button>
	</form:form>
</body>
</html>