<%--
  Created by IntelliJ IDEA.
  User: CLQ
  Date: 2019/10/16
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        img{
            width: 120px;
            height: 60px;
        }
    </style>

</head>
<body>
<h1>rs.jsp<%=System.currentTimeMillis()%></h1>

<h2>[${username}]</h2>

<div>
    <img src="<%=request.getContextPath()%>/static/images/1.jpg" >
</div>
<div>
    <img src="<%=request.getContextPath()%>/static/images/2.jpg" >
</div>
<div>
    <img src="<%=request.getContextPath()%>/static/images/3.jpg" >
</div>
</body>
</html>
