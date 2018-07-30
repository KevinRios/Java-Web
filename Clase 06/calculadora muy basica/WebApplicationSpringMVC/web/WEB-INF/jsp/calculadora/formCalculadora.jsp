<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="POST" action="suma.html">
            <input type="number" name="numero1">
            <input type="number" name="numero2">
            <button type="submit"> Enviar </button>  
        </form>
                
        
       <h2><c:out value="${resultado}" /></h2>
       
    </body>
</html>
