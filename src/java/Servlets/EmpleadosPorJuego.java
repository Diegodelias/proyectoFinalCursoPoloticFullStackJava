/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Juego;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego
 */
@WebServlet(name = "EmpleadosPorJuego", urlPatterns = {"/EmpleadosPorJuego"})
public class EmpleadosPorJuego extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
           Controladora ctrl = new Controladora();
        
        String juegoAsignado = request.getParameter("juegoelegido");
        
        System.out.println("juego asignado" + juegoAsignado);
        
       /* long num = Long.valueOf(3);*/
         long num = Long.parseLong( juegoAsignado);
        
        Juego juego = ctrl.TaerJuegoEnParticular(num);
       
        List<Empleado> listaEmpleados = ctrl.getListaEmpleados();
        List<Empleado> listaFinal = new ArrayList<Empleado>();
        
        for (Empleado EjuegoId:listaEmpleados  ){
            Juego empleJ = EjuegoId.getJuego();
            
                if(empleJ.getId()== num){
                    
                    listaFinal.add(EjuegoId);
                    
                    
                }
            
            
            
            
            
            
            
            
            
        }
        
        
        
       
             System.out.println("largoooo lista" + listaFinal.size());
          request.setAttribute("listaFinal", listaFinal);
          
          request.getRequestDispatcher("ListarEmpleporJuego.jsp").forward(request, response);
            
            
            
            
            
            
   
          
          
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
