<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Date fecha = new Date();%>

<h1>Hola mundo AJAX <%= fecha %></h1>

<h2> <%= request.getParameter("nombre") %> </h2>
