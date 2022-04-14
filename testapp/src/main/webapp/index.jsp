<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>

<head>
<title>Login page</title>


<style><%@include file="/WEB-INF/css/style.css"%></style>


</head>

<body>


    <div class="login">
		<h1>Login</h1>
	    <form  action="/testapp/login" method="post">
	    
	    	<input type="text" name="username" placeholder="Username" required="required" />
	    	
	        <input type="password" name="password" placeholder="Password" required="required" />
	        
	        <input type="submit" name="action" value="Login" class="btn btn-primary btn-block btn-large" >
	    </form>
	</div>





</body>
</html>




