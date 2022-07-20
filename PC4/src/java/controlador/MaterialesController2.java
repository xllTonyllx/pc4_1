package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.MAterialesDao1;
import modelo.MAterialesDao2;
import modelo.Materiales;


@WebServlet(name = "MaterialesController2", urlPatterns = {"/MaterialesController2"})
public class MaterialesController2 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        MAterialesDao2 materialesDao2 = new MAterialesDao2();
        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if(accion == null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("Materiales/index.jsp");
            List<Materiales> listaMateriales = materialesDao2.listarMateriales();
            request.setAttribute("lista", listaMateriales);
        } else if("nuevo".equals(accion)){
            dispatcher = request.getRequestDispatcher("Materiales/nuevo.jsp");
           
        }
        else if("insert".equals(accion)){
            int CodMaterial= Integer.parseInt(request.getParameter("CodMaterial"));
            int CodCategoria= Integer.parseInt(request.getParameter("CodCategoria"));
            String nombreMaterial= request.getParameter("nombreMaterial");
            int cantidad= Integer.parseInt(request.getParameter("cantidad"));
            Materiales material= new Materiales(CodMaterial, CodCategoria, nombreMaterial,cantidad);
            materialesDao2.insertar(material);
            dispatcher = request.getRequestDispatcher("Materiales/index.jsp");
            List<Materiales> listaMateriales = materialesDao2.listarMateriales();
            request.setAttribute("lista", listaMateriales);
        }
        
        
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
