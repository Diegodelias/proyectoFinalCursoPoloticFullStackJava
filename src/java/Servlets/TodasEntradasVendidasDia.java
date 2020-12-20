/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import Logica.Entrada;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego
 */
@WebServlet(name = "TodasEntradasVendidasDia", urlPatterns = {"/TodasEntradasVendidasDia"})
public class TodasEntradasVendidasDia extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TodasEntradasVendidasDia</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TodasEntradasVendidasDia at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          Controladora control =  new Controladora();
         String fecha = request.getParameter("fecha");
         
           
            
          SimpleDateFormat fechaformato= new SimpleDateFormat("yyyy-MM-dd");
          Date fechaFront= null;
         
        try {
            fechaFront= fechaformato.parse(fecha);
           
        } catch (ParseException ex) {
            Logger.getLogger(CrudEntradas.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
       
        List<Entrada> listaEntradas = control.getListaEntradas();
        List<Entrada> listaFinalvendidasdia= new ArrayList<Entrada>();
          
               for (Entrada ent:listaEntradas ){
                   if(ent.getFecha().equals(fechaFront)){
                   
                       listaFinalvendidasdia.add(ent);
                   
                   
                   
                   }
                                
                   
               
               }
        
        
               
               
           request.setAttribute("listaFinalvendidasdia", listaFinalvendidasdia);
          
          request.getRequestDispatcher("ListarEntradasVendidasDia.jsp").forward(request, response);
            
            
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
