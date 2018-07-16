<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String nombre= (String)application.getAttribute("nombre");
    int edad = (Integer)application.getAttribute("edad");
    Date fecha = (Date)application.getAttribute("fecha");
    
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
        
    </body>
</html>
