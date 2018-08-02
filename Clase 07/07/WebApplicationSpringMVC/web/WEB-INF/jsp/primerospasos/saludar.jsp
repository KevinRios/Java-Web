<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${texto}</h1>
        <h1><c:out value="${texto}" /></h1>
        
        <form method="post" action="saludar4.html">
            <input type="text" name="nombre">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
