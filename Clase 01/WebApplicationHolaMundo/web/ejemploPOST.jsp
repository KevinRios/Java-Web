<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="destinoPOST.jsp">
            Nombre: <input type="text" name="nombre"> <br>
            Edad:   <input type="number" name="edad"> <br>

            <button type="submit"> Enviar</button>
        </form>
    </body>
</html>
