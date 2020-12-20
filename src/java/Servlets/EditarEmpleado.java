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
@WebServlet(name = "EditarEmpleado", urlPatterns = {"/EditarEmpleado"})
public class EditarEmpleado extends HttpServlet {

  
    String editar="EditarEmpleados.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
  
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       /* processRequest(request, response);*/
       
       Controladora ctrl = new Controladora();
       
       String acceso="";
       String action = request.getParameter("accion");
       
    
       

       
       if (action.equalsIgnoreCase("editar")){
           /*captura id  pasado por url y se lo manda al formulario de dición*/
           request.setAttribute("idEmp",request.getParameter("id"));
           acceso=editar;
           
       } else if (action.equalsIgnoreCase("Actualizar")){
           
     
         
         /*traer empleado/
         
         */
      
         
        int idEM = Integer.parseInt(request.getParameter("txtid"));
         
        Empleado empleEditado = ctrl.TaerEmpleadoEnParticular(idEM);
         
        
        
        String nombre =  request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String dni = request.getParameter("dni");
       
        String cargo = request.getParameter("cargo");
        String juegoAsignado = request.getParameter("juegoAsignado");
        
        
      long id_juego = Long.parseLong(juegoAsignado);
        
        
        Juego juegoTemp = ctrl.TaerJuegoEnParticular(id_juego);
       
        empleEditado.setNombre(nombre);
      empleEditado.setApellido(apellido);
        empleEditado.setTelefono(telefono);
      empleEditado.setDni(dni);
       empleEditado.setCargo(cargo);
       empleEditado.setJuego(juegoTemp);
       
        
        ctrl.editarEmpleado(empleEditado);
        
        acceso  = "ListarEmpleados.jsp";
        
        
       } else if(action.equalsIgnoreCase("eliminar")){
           
           long idemple = Long.parseLong(request.getParameter("id"));
            
           ctrl.EliminarEmpleado((int) idemple);
            
            
          acceso = "ListarEmpleados.jsp";
        
                
            }
       
       RequestDispatcher vista = request.getRequestDispatcher(acceso);
       vista.forward(request, response);
        
        
        
        
        
        
        
        
        
        
        
    }

   
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
