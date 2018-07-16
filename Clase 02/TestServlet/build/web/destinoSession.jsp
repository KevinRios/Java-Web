<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String nombre= (String)session.getAttribute("nombre");
    int edad = (Integer)session.getAttribute("edad");
    Date fecha = (Date)session.getAttribute("fecha");
    String sessionId= session.getId();
    
 %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2><%= nombre %></h2>
        <h2><%= edad %></h2>
        <h2><%= fecha %></h2>
        <h2><%=sessionId%></h2>
        
    </body>
</html>
