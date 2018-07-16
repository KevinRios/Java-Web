<%@page import="ar.com.KevinRios.java.servlet.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Persona persona1 = (Persona) request.getAttribute("persona1");

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Nombre:    <%= persona1.getNombre() %>     <br>
        Apellido   <%= persona1.getApellido() %>   <br>
        Email:     <%= persona1.getEmail() %>   <br>
        Localidad: <%= persona1.getLocalidad() %>   <br>
        Notas:     <%= persona1.getNotas() %>   <br>
       
    </body>
</html>
