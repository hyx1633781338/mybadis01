<%--
  Created by IntelliJ IDEA.
  User: CLQ
  Date: 2019/10/17
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>文件上传</h1>
    <form action="<%=request.getContextPath()%>/upload1" method="post" enctype="multipart/form-data">
        <input type="file" name="img" >
        <input type="submit" value="ok" >

    </form>
    <h1>批量文件上传</h1>
    <form action="<%=request.getContextPath()%>/upload2" method="post" enctype="multipart/form-data">
        <input type="file" name="img" >
        <input type="file" name="img" >
        <input type="file" name="img" >
        <input type="submit" value="ok" >

    </form>

</body>
</html>
