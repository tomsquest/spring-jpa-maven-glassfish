<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Spring, JPA, Glassfish</title>
</head>
<body>
	<h3>List of Payments : ${toto}</h3>
	
	<ol>
		<c:forEach items="${payments}" var="payment">
			<li>${payment.label} ${payment.value}</li>
		</c:forEach>
	</ol>
	
</body>
</html>