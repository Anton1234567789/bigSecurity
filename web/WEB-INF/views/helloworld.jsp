
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <%--<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />--%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World</title>
</head>
<body>
<header>
    <h1>Title : ${title}</h1>
</header>
<section>
    <h1>Message : ${message}</h1>
</section>
<div>Get <a href="protected">protected</a> resource for admin.</div>
<div>Get <a href="confid">confidential</a> resource for superadmin.</div>
<footer>
    <div>Updated by S3k3l3v A. </div>
</footer>
</body>
</html>