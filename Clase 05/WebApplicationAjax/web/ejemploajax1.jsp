
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/jquery.blockUI.js" type="text/javascript"></script>
        <script>
            
            $(document).ajaxStart($.blockUI).ajaxStop($.unblockUI());
            
            $(document).ready(function() {
               $('#botonLlamarAjax').on('click', function() {
                   $.blockUI();
                   var valorNombre = $('#campoNombre').val();
                   $.get('contenidoajax1.jsp', { nombre : valorNombre }, function(resultado) {
                       $('#divContenidoAjax').html(resultado);
                       $.unblockUI();
                   });
               }); 
            });
        </script>
    </head>
    <body>
        <input type="text" id="campoNombre">
        <img src="img/ajax-loader.gif" alt="" style="display: none;" id="imagenAjax"/>
        <div id="divContenidoAjax"></div>
        <button id="botonLlamarAjax" type="button">Llamar ajax</button>
    </body>
</html>
