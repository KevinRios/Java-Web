<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            
            function saludar(){
                console.log("Ejecutando saludar");
                var texto = "hola a todos";
                var miDiv = document.getElementById("miDiv");
                miDiv.innerHTML = "<b>" + texto + "</b>";
            }
            
        </script>
    </head>
    <body>
        
        <div id="miDiv"> sin datos... </div>
        <button type="button" onclick="saludar()"> Saludar</button>
        
    </body>
</html>
