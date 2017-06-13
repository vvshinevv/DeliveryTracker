<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<c:forEach items="${deliveryTrackerList }" var="deliveryTrackerList">
	${deliveryTrackerList.invoiceNumber }	
</c:forEach>

</body>
</html>
