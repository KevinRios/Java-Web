<%-- 
    Document   : formulario
    Created on : 30/07/2018, 12:41:35
    Author     : EducaciónIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="calcular.html">
            Num1: <input type="text" name="num1"><br>
            Num2: <input type="text" name="num2"><br>
            <select name="operacion">
                <option value="sumar">Sumar</option>
                <option value="restar">Restar</option>
            </select>
            <button>Calcular</button>
        </form>
        <h1>Total:${total}</h1>
    </body>
</html>
