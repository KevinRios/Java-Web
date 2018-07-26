package ar.com.KevinRios.java.servlet;

import ar.com.KevinRios.java.objetos.GestorPersonas;
import ar.com.KevinRios.java.objetos.Persona;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuscarPersonasServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String textoBuscar = request.getParameter("textoBuscar");
        if(textoBuscar == null){
            textoBuscar = "";
        }
        GestorPersonas gestor = new GestorPersonas();
        ArrayList<Persona> personas = gestor.buscarPersonas(textoBuscar);
        request.setAttribute("personas", personas);
        
        RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
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
