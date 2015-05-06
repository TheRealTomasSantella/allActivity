<%-- 
    Document   : profile
    Created on : 05 6, 15, 4:04:13 PM
    Author     : mrsunnybunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <a href = "home.jsp">Home</a>
        <a href = "profile.jsp">Profile</a>
        <h1>Hello World!<%=session.getAttribute("username")%></h1>
    </body>
</html>
