/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Juego;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego
 */
@WebServlet(name = "AltaEmpleadoUsuario", urlPatterns = {"/AltaEmpleadoUsuario"})
public class AltaEmpleadoUsuario extends HttpServlet {

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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         Controladora ctrl = new Controladora();
        
        
        String nombre =  request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String dni = request.getParameter("dni");
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String cargo = request.getParameter("cargo");
        String juegoAsignado = request.getParameter("juegoAsignado");
        
        
        
        /*crear objeto user  yt objeto  juego*/
        //para crear onjeto primero obntener objeto juego de la base de datos
        
            long idJuego = Long.parseLong(juegoAsignado);
        
           Juego jue  =  ctrl.TaerJuegoEnParticular(idJuego);
     
            
            Usuario user = new Usuario();
            
            user.setNombreUsuario(usuario);
            user.setContrasenia(password);
        
        
         
         //crear usuario en la tabla usuario obtenerlo y guardarlo en Empelado   
            
            Empleado emple = new Empleado();
            emple.setApellido(apellido);
            emple.setCargo(cargo);
            emple.setDni(dni);
           emple.setJuego(jue);
            emple.setNombre(nombre);
            emple.setTelefono(telefono);
           emple.setUser(user);
            
            
          /*  ctrl.crearuUsuario(user);*/
            
            ctrl.crearEmpleado(emple);
        
          
        
       
        response.sendRedirect("ListarEmpleados.jsp");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
