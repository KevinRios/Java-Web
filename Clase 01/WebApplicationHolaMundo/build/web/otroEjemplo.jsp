<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Titulo1 </h1>
        <h2> Titulo2 </h2>
        <a href="http://www.clarin.com" target="_blank"> Ir a clarin </a>
        <img src="img/ejemplo.jpg"><br>
        <a href="http://www.clarin.com" target="_blank"> <img src="img/ejemplo.jpg"><br> </a>

        <ul>
            <li>Uno</li>
            <li>Dos</li>
            <li>Tres</li>

            <p>qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwertyqwertyqwerty</p>
        </ul>

        <table>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Edad</th>
            </tr>
            <tr>
                <td>qwert</td>
                <td>asd</td>
                <td>77</td>
            </tr>

            <%for (int i = 0; i < 10; i++) { %>
            <tr>
                <td>Juan</td>
                <td>Lopez</td>
                <td>44</td>
            </tr>

            <%  }%>
            <tr>
                <td>iop</td>
                <td>kkkkkk</td>
                <td>1</td>
            </tr>
        </table>

        <div> nada 123456789</div>
        <div> nada 123456</div>

        <input type="text" name="campoTexto" size="10" maxlength="5"> <br>
        <input type="number" name="campoNumero" min="3" maxlength="50" step="1"> <br>
        <input type="password" name="campoPassword"> <br>
        <input type="email" name="campoEmail"> <br>
        <input type="hidden" name="campoOculto" value="666hola"> <br>
        <textarea name="campoTextArea" rows="5" cols="10"></textarea> <br>
        <select name="campoSelect1">
            <option value="valor1"> Uno1 </option>
            <option value="valor2"> Dos2 </option>
            <option value="valor3"> Tres3 </option>            
        </select> <br>
        <select name="campoSelect2" multiple="true">
            <option value="valor1"> Uno1 </option>
            <option value="valor2"> Dos2 </option>
            <option value="valor3"> Tres3 </option>            
        </select> <br>
        <input type="checkbox" name="campoCheckBox" checked="true"> checked!!!<br>
        <input type="radio" name="campoRadio" checked="true" value="uno">  <br>
        <input type="radio" name="campoRadio" checked="true" >

    </body>
</html>
