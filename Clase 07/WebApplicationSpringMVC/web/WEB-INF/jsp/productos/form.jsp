<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Formulario</title>

    </head>

    <body>
        <h1>Formulario producto</h1>
        <br />
        <form:form commandName="productoForm" method="POST" action="guardar.html">
            <form:hidden path="id" />
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><form:input path="nombre"/><form:errors path="nombre" /></td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td><form:input path="precio"/><form:errors path="precio" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Guardar" /></td>
                </tr>
            </table>
        </form:form>

    </body>
</html>