<%@page import="ar.com.KevinRios.java.objetos.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<jsp:include page="template_superior.jsp"></jsp:include>    
    <script>
        $(document).ready(function () {
                $('#buscarREST').on('click', function () {
                    var url = "BuscarPersonasServlet";
                    $.post(url, $('#formDatos').serialize() , function (respuesta) {
                        $('#tablaResultados').html(respuesta);
                    });
                });
            });
    </script>
    
    <h1>Lista Personas  </h1>

    <form id="formDatos">
        <input type="text" name= "textoBuscar" placeholder="Buscador...">
        <button id="buscarREST" type="button"> Buscar </button>
    </form>

    <div id="tablaResultados">
        
    </div>



<jsp:include page="template_inferior.jsp"></jsp:include>   
