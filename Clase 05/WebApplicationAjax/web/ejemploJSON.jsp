<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            var personas=[
                {
                nombre: "juan",
                edad: 34,
                esCasado: false                
                },
                {
                nombre: "pedro",
                edad: 22,
                esCasado: true   
                }
             ];
            
            alert(personas[0].nombre+' '+ personas[0].edad);
            alert(personas[1].nombre+' '+ personas[1].edad);
            
        </script>
            
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
