package ar.com.KevinRios.java.servlet;

import ar.com.KevinRios.java.objetos.GestorPersonas;
import ar.com.KevinRios.java.objetos.Persona;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BorrarPersonasServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("idPersona");
        if(id==null){
            id="";
        }
        System.out.println("se va a borrar al usuario " + id);

        Persona persona1 = new Persona();        
        GestorPersonas gestorP = new GestorPersonas();
        gestorP.bajaPersona(persona1);
        
        RequestDispatcher rd = request.getRequestDispatcher("listadoPersonas.jsp");
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
