<%@page import="ar.com.KevinRios.java.objetos.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    
    
<%
    ArrayList<Persona> personas = (ArrayList<Persona>) request.getAttribute("personas");
%>

<table id="tablaPersonas" class="display" style="width:100%">
    <thead>
        <tr>
            <th> Id </th>
            <th> Nombre </th>
            <th> Apellido </th>
            <th> Email </th>
            <th> Borrar </th>
        </tr>
    </thead>
    <tbody>
        <% for (Persona p : personas) {%>
        <tr>
            <td> <%= p.getIdPersona()%> </td>
            <td> <%= p.getNombre()%> </td>
            <td> <%= p.getApellido()%> </td>
            <td> <%= p.getEmail()%> </td>
            <td><a href=""></td>
            <td> <button type="submit" action="BorrarPersonasServlet"> Borrar </button></td>
        </tr>
        <% }%>  
    </tbody>
</table>
    
    