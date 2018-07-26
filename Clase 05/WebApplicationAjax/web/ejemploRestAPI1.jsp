<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script>
            $(document).ready(function(){
                $('#botonLlamarREST').on('click',function(){
                    var url= "https://jsonplaceholder.typicode.com/posts/1";
                    
                    $.getJSON(url, function(respuesta){
                        $('#divContenidoREST').html('<b>' + respuesta.id+' '+ respuesta.title+'</b>');
                    });
                });
            });
            
        </script>
        
    </head>
    <body>
        <div id="divContenidoREST"></div>
        <button id="botonLlamarREST" type="button"> Llamar API REST </button>
    </body>
</html>
