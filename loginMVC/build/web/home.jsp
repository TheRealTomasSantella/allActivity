<%-- 
    Document   : home
    Created on : 05 6, 15, 3:57:22 PM
    Author     : mrsunnybunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <a href = "home.jsp">Home</a>
        <a href = "profile.jsp">Profile</a>
        <a href="logOutServlet">Logout</a>
        <h1>Hello World! <%=session.getAttribute("username")%></h1>
    </body>
</html>
