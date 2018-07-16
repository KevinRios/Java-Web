<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
   String nombre = "kevin";
   int edad= 26;
   Date fecha = new Date();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h1> <%= nombre %> </h1>
        <h2> <%= edad %> </h2>
        <h3> <%= fecha %> </h3>
        
        <% for (int i = 0; i < 10; i++) { %>
        
        <b> Hola <%= i %> </b> <br>
        
        <% } %>

}
        
    </body>
</html>
