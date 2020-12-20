/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import Logica.Horario;
import Logica.Juego;
import Persistencia.ControladoraPersistencia;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego
 */
@WebServlet(name = "AltaJuego", urlPatterns = {"/AltaJuego"})
public class AltaJuego extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
     String editar="EditarJuegos.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
  
    }


    
    
    
    
    
    
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    
        
        
        
        
        
        
      
        
    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    Controladora ctrl = new Controladora();
        
        String nombreJuego =  request.getParameter("nombreJuego");
        
        
     
        
        String horaInicio = request.getParameter("horaInicio");
        
        
        String horaFin = request.getParameter("horaFin");
        
        
       
        
        Horario horario = new Horario();
        
     
     
    
        
       SimpleDateFormat hora1 = new SimpleDateFormat("HH:mm");
        try { 
          Date horaIniciofinal = hora1.parse(horaInicio);
          horario.setHora_inicio(horaIniciofinal);
        } catch (ParseException ex) {
            Logger.getLogger(AltaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
             
       SimpleDateFormat hora2 = new SimpleDateFormat("HH:mm");
        try { 
         Date  horaFinFinal = hora2.parse(horaFin);
          horario.setHora_fin(horaFinFinal);
        } catch (ParseException ex) {
            Logger.getLogger(AltaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        Juego nuevoJuego = new Juego();
        
        nuevoJuego.setNombreJuego(nombreJuego);
        nuevoJuego.setHorario(horario);
        
       /**horario.setJuego(nuevoJuego);**/
         
        
       
        
      
     
       
        
      
        
      /*  ctrl.crearHorario(horario);*/
       
        ctrl.crearJuego(nuevoJuego);
        
   
        request.getSession().setAttribute("horaInicio",horaInicio);
         request.getSession().setAttribute("nombreJuego",nombreJuego);
        
        response.sendRedirect("ListarJuegos.jsp");
        
        
        
     
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
