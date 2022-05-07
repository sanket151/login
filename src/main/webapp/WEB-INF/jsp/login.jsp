<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>Welcome</title>
</head>
<body>
    
<h1> ${username} </h1>
<a href="${contextPath}/welcome">Back</a>

</body>
</html>