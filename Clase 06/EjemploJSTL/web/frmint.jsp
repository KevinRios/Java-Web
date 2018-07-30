<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    request.setAttribute("fechaActual", new Date());

    double numeroActual = 5987.56;
    request.setAttribute("numeroActual", new Double(numeroActual));

    request.setAttribute("nombre", "Juan");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
     
        <table border="1">
            <tr>
                <td valign="top" ><b>formatDate:</b></td>
                <td>
                    <fmt:formatDate value="${fechaActual}" dateStyle="default" /><br>
                    <fmt:formatDate value="${fechaActual}" dateStyle="short" /><br>
                    <fmt:formatDate value="${fechaActual}" dateStyle="medium" /><br>
                    <fmt:formatDate value="${fechaActual}" dateStyle="long" /><br>
                    <fmt:formatDate value="${fechaActual}" dateStyle="full" /><br>
                    <fmt:formatDate pattern="dd-MM-yyyy" value="${fechaActual}" /><br>
                    <fmt:formatDate pattern="hh:mm" value="${fechaActual}" /><br>			
                </td>
            </tr>
            <tr>
                <td valign="top" ><b>formatNumber:</b></td>
                <td>
                    <fmt:formatNumber type="currency" value="${numeroActual}" /><br>
                    <fmt:formatNumber type="currency" currencySymbol="U$D" value="${numeroActual}" /><br>
                    <fmt:formatNumber type="percent" value="${numeroActual}" /><br>
                    <fmt:formatNumber type="number" value="${numeroActual}" /><br>
                    <fmt:formatNumber pattern="0.0000000" value="${numeroActual}"/>
                </td>
            </tr>
            <tr>
                <td valign="top" ><b>i18n:</b></td>
                <td>
                    <fmt:bundle basename="textos">
                        <fmt:message key="nombre.texto" /><br>
                        <fmt:message key="saludo.texto">
                            <fmt:param value="${nombre}" />
                        </fmt:message>
                    </fmt:bundle>
                </td>
            </tr>
        </table>

    </body>
</html>