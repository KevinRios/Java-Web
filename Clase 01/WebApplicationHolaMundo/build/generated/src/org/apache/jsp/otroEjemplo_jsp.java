package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class otroEjemplo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Titulo1 </h1>\n");
      out.write("        <h2> Titulo2 </h2>\n");
      out.write("        <a href=\"http://www.clarin.com\" target=\"_blank\"> Ir a clarin </a>\n");
      out.write("        <img src=\"img/ejemplo.jpg\"><br>\n");
      out.write("        <a href=\"http://www.clarin.com\" target=\"_blank\"> <img src=\"img/ejemplo.jpg\"><br> </a>\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("            <li>Uno</li>\n");
      out.write("            <li>Dos</li>\n");
      out.write("            <li>Tres</li>\n");
      out.write("\n");
      out.write("            <p>qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwertyqwertyqwerty</p>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <th>Apellido</th>\n");
      out.write("                <th>Edad</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>qwert</td>\n");
      out.write("                <td>asd</td>\n");
      out.write("                <td>77</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
for (int i = 0; i < 10; i++) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Juan</td>\n");
      out.write("                <td>Lopez</td>\n");
      out.write("                <td>44</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
  }
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>iop</td>\n");
      out.write("                <td>kkkkkk</td>\n");
      out.write("                <td>1</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div> nada 123456789</div>\n");
      out.write("        <div> nada 123456</div>\n");
      out.write("\n");
      out.write("        <input type=\"text\" name=\"campoTexto\" size=\"10\" maxlength=\"5\"> <br>\n");
      out.write("        <input type=\"number\" name=\"campoNumero\" min=\"3\" maxlength=\"50\" step=\"1\"> <br>\n");
      out.write("        <input type=\"password\" name=\"campoPassword\"> <br>\n");
      out.write("        <input type=\"email\" name=\"campoEmail\"> <br>\n");
      out.write("        <input type=\"hidden\" name=\"campoOculto\" value=\"666hola\"> <br>\n");
      out.write("        <textarea name=\"campoTextArea\" rows=\"5\" cols=\"10\"></textarea> <br>\n");
      out.write("        <select name=\"campoSelect1\">\n");
      out.write("            <option value=\"valor1\"> Uno1 </option>\n");
      out.write("            <option value=\"valor2\"> Dos2 </option>\n");
      out.write("            <option value=\"valor3\"> Tres3 </option>            \n");
      out.write("        </select> <br>\n");
      out.write("        <select name=\"campoSelect2\" multiple=\"true\">\n");
      out.write("            <option value=\"valor1\"> Uno1 </option>\n");
      out.write("            <option value=\"valor2\"> Dos2 </option>\n");
      out.write("            <option value=\"valor3\"> Tres3 </option>            \n");
      out.write("        </select> <br>\n");
      out.write("        <input type=\"checkbox\" name=\"campoCheckBox\" checked=\"true\"> checked!!!<br>\n");
      out.write("        <input type=\"radio\" name=\"campoRadio\" checked=\"true\" value=\"uno\">  <br>\n");
      out.write("        <input type=\"radio\" name=\"campoRadio\" checked=\"true\" >\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
