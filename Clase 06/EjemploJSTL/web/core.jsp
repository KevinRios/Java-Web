<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

    request.setAttribute("textoRequest", "HolaMundo JSTL (Request)");
    session.setAttribute("textoSession", "HolaMundo JSTL (Session)");
    application.setAttribute("textoApplication", "HolaMundo JSTL (Application)");

    ArrayList nombres = new ArrayList();
    nombres.add("Pepe");
    nombres.add("Juan");
    nombres.add("Maria");
    request.setAttribute("nombres", nombres);

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>

        <table border="1">
            <tr>
                <td valign="top" ><b>out:</b></td>
                <td>
                    <c:out value="${textoRequest}" /><br>
                    <c:out value="${textoSession}" /><br>
                    <c:out value="${textoApplication}" /><br>
                    <c:out default="No hay nada en la var xyz" value="${xyz}" />
                </td>
            </tr>
            <tr>
                <td valign="top" ><b>url:</b></td>
                <td>
                    <a href='<c:url value="/ejemplosjstl/core.jsp"><c:param name="texto" value="${textoRequest}" /></c:url>'>Url con parametros</a>
                    <c:out default="" value="${param['texto']}"  /><br>
                </td>
            </tr>
            <tr>
                <td valign="top" ><b>if:</b></td>
                <td>
                    <c:if test="${textoRequest == 'HolaMundo JSTL (Request)'}">
                        la var textoRequest contiene el texto HolaMundo JSTL (Request) <br>
                    </c:if>

                    <c:if test="${not empty textoSession}">
                        la var textoSession no es null <br>
                    </c:if>
                </td>
            </tr>
            <tr>
                <td valign="top" ><b>choose:</b></td>
                <td>
                    <c:choose>
                        <c:when test="${textoApplication == 'hola'}">
                            El texto es hola
                        </c:when>
                        <c:when test="${textoApplication == 'chau'}">
                            El texto es chau
                        </c:when>
                        <c:otherwise>
                            el texto no es hola y tampoco chau
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td valign="top" ><b>forEach:</b></td>
                <td>
                    <c:forEach items="${nombres}" var="nombre" >
                        Nombre:<c:out value="${nombre}" /><br>
                    </c:forEach>
                </td>
            </tr>
            <tr>
                <td valign="top" ><b>forTokens:</b></td>
                <td>
                    <c:forTokens items="1:2:3:4" delims=":" var="numero">
                        Numero:<c:out value="${numero}" /><br>
                    </c:forTokens>
                </td>
            </tr>
        </table>

    </body>
</html>