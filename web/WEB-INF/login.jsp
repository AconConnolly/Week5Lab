<%-- 
    Document   : login
    Created on : Feb 6, 2023, 11:05:31 AM
    Author     : alexc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="Get">
            Username: <input type="text" name="username"><br>
            Password <input type="text" name="password"><br>
            <input type="submit" value="Log in">
            ${error}
        </form>
    </body>
</html>
