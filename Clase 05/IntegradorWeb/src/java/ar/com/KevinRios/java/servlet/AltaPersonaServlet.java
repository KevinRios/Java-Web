package ar.com.KevinRios.java.servlet;

import ar.com.KevinRios.java.objetos.GestorPersonas;
import ar.com.KevinRios.java.objetos.Persona;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AltaPersonaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String localidad = request.getParameter("localidad");
        String notas = request.getParameter("notas");
        double sueldo = Double.parseDouble(request.getParameter("sueldo"));

        Persona persona1 = new Persona(0, nombre, apellido, notas, email, localidad, sueldo);
        GestorPersonas gestorP = new GestorPersonas();
        gestorP.altaPersona(persona1);
        
        System.out.println("--------");
        System.out.println("Se dio de alta una persona");
        System.out.println("--------");
        
        request.setAttribute("persona1", persona1);
        RequestDispatcher rd = request.getRequestDispatcher("formularioPOST.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
