<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        
        <h1>Hello World!</h1>
        
        <h2> ${texto}</h2>
        <h2><c:out value="${texto}" /></h2>
        
        <form method="POST" action="saludar5.html">
            <input type="text" name="nombre">
            <input type="number" name="edad">
            <button type="submit"> Enviar  </button>        
        </form>
            
    </body>
    
</html>
