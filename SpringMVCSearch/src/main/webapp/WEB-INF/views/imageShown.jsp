<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Image Show works</title>
</head>
<body>
<h1>Image!!</h1>

<image 
alt="pikachu image" 
src=" <c:url value="/resources/images/${filename }"/> " 
/>
</body>
</html>