<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nombre = request.getParameter("nombre");
    String edad = request.getParameter("edad");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Nombre: <%= nombre %> <br>
        Edad:   <%= edad %>   <br>
       
    </body>
</html>
