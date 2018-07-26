<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script>
            $(document).ready(function(){
              alert("holaaa");
            });
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <input type="text" id="campoNombre">
        <img src="img/ajax-loader.gif" alt="" style="display: none" id="imgLoading"/>
        <div id="divContenidoAJAX">  </div>
        <button id="botonLlamarAJAX" type="button"> Llamar AJAX </button>
    </body>
</html>
