<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h2>Alta personas</h2>
        
        <form:form commandName="personaForm" method="POST" action="guardar.html">
            <form:hidden path="id"/>
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><form:input path="nombre"/><form:errors path="nombre" /></td>
                </tr>
                <tr>
                    <td>Apellido</td>
                    <td><form:input path="apellido"/><form:errors path="apellido" /></td>
                </tr>
                <tr>
                    <td>DNI</td>
                    <td><form:input path="dni"/><form:errors path="dni" /></td>
                </tr>
                 <tr>
                    <td><input type="submit" value="Guardar" /></td>
                </tr>                
            </table>
                

        </form:form>
            
            
     
        
        
        
        
    </body>
</html>
