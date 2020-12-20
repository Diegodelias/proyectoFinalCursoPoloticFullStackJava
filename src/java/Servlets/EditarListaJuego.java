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
@WebServlet(name = "EditarListaJuego", urlPatterns = {"/EditarListaJuego"})
public class EditarListaJuego extends HttpServlet {

    String editar="EditarJuegos.jsp";
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
        
                     
       Controladora ctrl = new Controladora();
       
       String acceso="";
       String action = request.getParameter("accion");
       
       
          if (action.equalsIgnoreCase("editar")){
           /*captura id  pasado por url y se lo manda al formulario de dición*/
           request.setAttribute("idJue",request.getParameter("id"));
           acceso=editar;
           
       } else if (action.equalsIgnoreCase("Actualizar")){
           
     
         
            long idJu = Long.parseLong( (String) request.getParameter("txtid"));
         
            Juego juegoeditar = ctrl.TaerJuegoEnParticular(idJu);
         
        
        
        String nombrejuego =  request.getParameter("nombreJuego");
        String horaInicio = request.getParameter("horaInicio");
        String horaFin = request.getParameter("horaFin");
       
        
        
        Horario horariotemp = juegoeditar.getHorario();
        
        
         SimpleDateFormat hora1 = new SimpleDateFormat("HH:mm");
        try { 
          Date horaIniciofinal = hora1.parse(horaInicio);
          horariotemp.setHora_inicio(horaIniciofinal);
        } catch (ParseException ex) {
            Logger.getLogger(AltaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
           SimpleDateFormat hora2 = new SimpleDateFormat("HH:mm");
        try { 
         Date  horaFinFinal = hora2.parse(horaFin);
           horariotemp.setHora_fin(horaFinFinal);
        } catch (ParseException ex) {
            Logger.getLogger(AltaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        juegoeditar.setNombreJuego(nombrejuego);
      
   
        
        ctrl.editarJuego(juegoeditar);
        
        acceso  = "ListarJuegos.jsp";
        
        

        
       } else if(action.equalsIgnoreCase("eliminar")){
            long idJu = Long.parseLong(request.getParameter("id"));
         
            
           ctrl.EliminarJuego(idJu);
            
            
          acceso = "ListarJuegos.jsp";
        
                
            }
       
       
       
        
        
       RequestDispatcher vista = request.getRequestDispatcher(acceso);
       vista.forward(request, response);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
