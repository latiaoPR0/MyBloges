<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Controller/customer?getindex=1" method="POST">
        <h3>
            <a>
                <button type="submit"/>点击登录
            </a>
        </h3>
    </form>
</body>
</html>
