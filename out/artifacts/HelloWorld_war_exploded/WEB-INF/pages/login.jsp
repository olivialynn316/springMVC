<%--
  Created by IntelliJ IDEA.
  User: wb-yxj268701
  Date: 2017/5/22
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<body>
<form id="login-form">
    <div>
        <input name="username" id="username"/>
    </div>
    <div>
        <input type="password" name="password" id="password"/>
    </div>
    <div>
        <button name="login" id="login">登录</button>
    </div>
</form>
</body>
<script>
    $(function () {
        var loginUrl = '/login';
        $('#login').click(function (e) {
            e.preventDefault();
            $.post(loginUrl, $('#login-form').serialize(), function (data) {
                console.log(JSON.stringify(data));
//                if(data){
//                    location.href='/pages/welcome';
//                } else {
//                    location.reload();
//               }
            });
        });
    });
</script>
</html>
