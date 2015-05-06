<%-- 
    Document   : user
    Created on : 05 6, 15, 3:02:50 PM
    Author     : mrsunnybunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <%
            String type = request.getParameter("type");
        %>
        <h1>Hello World! Type <%=type%></h1>
    </body>
</html>
