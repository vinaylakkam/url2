<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="req" value="${pageContext.request}" />
	<c:set var="baseURL"
		value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath}" />

	URL1 :
	<a href="${url1}">${url1}</a>
	<br /> URL2 :
	<a href="${baseURL}/${url2}">${baseURL}/${url2}</a>

</body>
</html>