<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h2> 
            <a href="nuevo.html">Nuevo</a> 
        </h2>
        
        <table>
            <tr>
                <td> ID </td>
                <td> Nombre </td>
                <td> Apellido </td>
                <td> DNI </td>
            </tr>
            <c:forEach items= "${personas}" var="personas">
                <tr>
                    <td> ${personas.id} </td>
                    <td> ${personas.nombre} </td>
                    <td> ${personas.apellido} </td>
                    <td> ${personas.dni} </td>
                </tr>
            </c:forEach>
            
            
        </table>
        
        
    </body>
</html>
