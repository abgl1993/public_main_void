<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello
<jsp:useBean id="userBean" class="model.User" scope="request" ></jsp:useBean>
Welcome <jsp:getProperty property="fname" name="userBean"/>
</body>
</html>