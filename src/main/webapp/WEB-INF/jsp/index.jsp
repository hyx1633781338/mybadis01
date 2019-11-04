<%--
  Created by IntelliJ IDEA.
  User: CLQ
  Date: 2019/10/17
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@taglib prefix="t" uri="http://www.springframework.org/tags" %>
</head>
<body>
    <h1>index.jsp<%=System.currentTimeMillis()%></h1>
    <p>
        <a href="<%=request.getContextPath()%>/zh">zh</a>
        <a href="<%=request.getContextPath()%>/en">en</a>
        <a href="${ctx}/bk/toAdd">增加</a>
    </p>
    <p>
        <t:message code="yhzh.label"></t:message>
    </p>


</body>
</html>
