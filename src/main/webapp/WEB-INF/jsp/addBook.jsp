<%--
  Created by IntelliJ IDEA.
  User: CLQ
  Date: 2019/10/16
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@include file="head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>书本新增<%=System.currentTimeMillis()%></h1>
    <f:form modelAttribute="book" action="${ctx}/bk/add" method="post">
        <%--ID<f:input path="bookId"/><br>--%>
        书名<f:input path="bookName"/><br>
        价格<f:input path="bookPrice"/><br>
        简介<f:input path="bookBrief"/><br>
        <input type="submit" name="确认" />
    </f:form>



</body>
</html>
