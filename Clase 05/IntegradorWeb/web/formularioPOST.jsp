<%@page import="ar.com.KevinRios.java.objetos.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Persona persona1 = (Persona) request.getAttribute("persona1");

%>
<jsp:include page="template_superior.jsp"></jsp:include>       

        <h1>Hello World!</h1>
        Nombre:    <%= persona1.getNombre() %>     <br>
        Apellido   <%= persona1.getApellido() %>   <br>
        Email:     <%= persona1.getEmail() %>   <br>
        Localidad: <%= persona1.getLocalidad() %>   <br>
        Notas:     <%= persona1.getNotas() %>   <br>
        Sueldo:    <%= persona1.getSueldo() %>   <br>
       
 <jsp:include page="template_inferior.jsp"></jsp:include>    