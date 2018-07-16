<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String nombre = (String) request.getParameter("nombre");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= nombre %></h1>
    </body>
</html>
