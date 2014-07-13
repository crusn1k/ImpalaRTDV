<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.errors {
	font-family: Arial;
	font-size: 9pt;
	color: red;
}
</style>
</head>
<body>
	<form:form action='login' method='post' modelAttribute="model">
		<fieldset>
			<legend>Login</legend>
			<input name="userName" type='text' id='user' placeholder="user name" required="required" /><br />
			<form:errors path="userName" class="errors" />
			<br /> <input name="password" type='password' id='pwd' placeholder="password" required="required"  /><br />
			<form:errors path="password" class="errors" />
			<br /> <input type='submit' value='login' />
		</fieldset>
	</form:form>
</body>
</html>