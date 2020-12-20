/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import Logica.Entrada;
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
@WebServlet(name = "CrudEntradas", urlPatterns = {"/CrudEntradas"})
public class CrudEntradas extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           
       Controladora ctrl = new Controladora();
       
       String acceso="";
       String action = request.getParameter("accion");
       
        
        
       
        if(action.equalsIgnoreCase("eliminar")){
           
           long idemple = Long.parseLong(request.getParameter("id"));
            
           ctrl.EliminarEntrada((int) idemple);
            
            
          acceso = "ListarEntradas.jsp";
        
                
            }
       
       RequestDispatcher vista = request.getRequestDispatcher(acceso);
       vista.forward(request, response);
        
        
        /*processRequest(request, response);*/
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
           
         Controladora controladora = new Controladora();
         
         
     
        String cliente =  request.getParameter("cliente");
      
       String fecha = request.getParameter("fecha");
      String juegoElegido = request.getParameter("juegoelegido");
        
           String horaElegida = request.getParameter("horaInicio");
        
        request.setAttribute("idJue",request.getParameter("juegoElegido"));
  
     
        long idJuego = Long.parseLong( (String) juegoElegido);
        
     
        
         int idCliente = Integer.parseInt(cliente);
        
        
        
        Entrada entrada = new Entrada();
        
      
  
          
            
          SimpleDateFormat fechaformato= new SimpleDateFormat("yyyy-MM-dd");
          Date fechafinal= null;
                    
        try {
            fechafinal= fechaformato.parse(fecha);
            entrada.setFecha(fechafinal);
        } catch (ParseException ex) {
            Logger.getLogger(CrudEntradas.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
          
      
           
       SimpleDateFormat hora1 = new SimpleDateFormat("HH:mm");
        Date horainicio= null;
        try { 
          Date horaIniciofinal = hora1.parse(horaElegida);
          horainicio = horaIniciofinal; /* hora front convertida*/
        } catch (ParseException ex) {
            Logger.getLogger(AltaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
                 
   
//pasar horarios del jeugo a String        
         
         Juego jue  =  controladora.TaerJuegoEnParticular(idJuego);
        
        
         
         
         Horario horarioJuego = jue.getHorario();
        
         SimpleDateFormat formatter=new SimpleDateFormat("HH:mm");
        
       String horarioinicioString=formatter.format(horarioJuego.getHora_inicio());
       String horariofinString=formatter.format(horarioJuego.getHora_fin());
                                                                
        
       
       //pasar horarios a date HH:mm
        
        
         SimpleDateFormat horajuego1 = new SimpleDateFormat("HH:mm");
            Date horariojuegoinicio= null;
        try { 
          Date horarioIniciofinal = horajuego1.parse(horarioinicioString);
         horariojuegoinicio= horarioIniciofinal; /* hora front convertida a date?*/
        } catch (ParseException ex) {
            Logger.getLogger(AltaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
          
     
        
       
             
         SimpleDateFormat horajuego2 = new SimpleDateFormat("HH:mm");
            Date horariojuegofin= null;
        try { 
          Date horariojuegofinal = horajuego2.parse(horariofinString);
         horariojuegofin= horariojuegofinal; /* hora front convertida a date?*/
        } catch (ParseException ex) {
            Logger.getLogger(AltaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
     
        
         
   
        
   /*   String horariojuego1=formatter.format(horarioJuego.getHora_inicio());
      String horariojuego2=formatter.format(horarioJuego.getHora_fin());
      String horariofinalFront =  formatter.format(horainicio);
        */
        
       if (horariojuegoinicio.before(horainicio) && horariojuegofin.after(horainicio)){
      /*    if ( horariofinalFront.equals(horariojuego1) && horariofinalFront.equals(horariojuego2)){   */
            Cliente cli = controladora.TaerClienteEnParticular(idCliente);
             
             entrada.setNombre_cliente(cli.getNombre());
             entrada.setApellido_Cliente(cli.getApellido());
             entrada.setJuego(jue);
             entrada.setCliente(cli);
             controladora.crearEntrada(entrada);
             response.sendRedirect("ListarEntradas.jsp");
         /* request.getRequestDispatcher("ListarEntradas.jsp").forward(request, response);*/
            
            
        } else {
            
            response.sendRedirect("horarioinvalido.jsp");
            
        }
        
        
        
        
        


        
       

        
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
