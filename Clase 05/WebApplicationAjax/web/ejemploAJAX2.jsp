<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/jquery.blockUI.js" type="text/javascript"></script>
        <script>
            $(document).ready(function() {
               $('#botonLlamarAjax').on('click', function() {
                  var datosForm = $('#formDatos').serialize();
                  $.post('contenidoajax1.jsp',datosForm,function(resultado){
                      $('#divContenidoAjax').html(resultado);
                  }); 
               }); 
            });
        </script>
    </head>
    <body>
      
        <form id="formDatos">
            Nombre: <input name="nombre" type="text"><br>
            Apellido: <input name="apellido" type="text"><br>
            
            
        </form>
        
        <div id="divContenidoAjax"></div>
        <button id="botonLlamarAjax" type="button">Llamar ajax</button>
    </body>
</html>
