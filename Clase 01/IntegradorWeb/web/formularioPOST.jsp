<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nombre = request.getParameter("nombre");
    String apellido= request.getParameter("apellido");
    String email= request.getParameter("email");
    String localidad= request.getParameter("localidad");
    String notas= request.getParameter("notas");

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Nombre:    <%= nombre %>     <br>
        Apellido   <%= apellido %>   <br>
        Email:     <%= email %>   <br>
        Localidad: <%= localidad %>   <br>
        Notas:     <%= notas %>   <br>
       
    </body>
</html>
