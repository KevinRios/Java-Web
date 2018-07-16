<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String nombre="kevin";
    int edad = 34;
    Date fecha = new Date();
    String sessionId="";
    
    
    application.setAttribute("nombre", nombre);
    application.setAttribute("edad", edad);
    application.setAttribute("fecha", fecha);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Origen Application </h1>
    </body>
</html>