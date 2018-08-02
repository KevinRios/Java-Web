<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form:form commandName="calculadoraForm" method="POST" action="calcular.html">
            <table>
                    <tr>
                        <td>Num1</td>
                        <td><form:input path="num1"/><form:errors path="num1" /></td>
                    </tr>
                    <tr>
                        <td>Num2</td>
                        <td><form:input path="num2"/><form:errors path="num2" /></td>
                    </tr>
                    <tr>
                        <td>Operacion</td>
                        <td>
                            <form:select path="operacion">
                                <form:option value="sumar">Sumar</form:option>
                                <form:option value="restar">Restar</form:option>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>Total</td>
                        <td><b>${total}</b></td>
                    </tr>
                    <tr>
                        <td colspan="2"><button type="submit">Calcular</button></td>
                    </tr>
            </table>
        </form:form>
    </body>
</html>
