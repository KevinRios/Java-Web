<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form mehotd="POST" action="HolaMundoServlet">
            <input type="text" name="campoNombre">
            <button type="submit"> Enviar Datos </button>
        </form>
        
    </body>
</html>
