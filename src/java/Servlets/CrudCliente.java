/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
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
@WebServlet(name = "CrudCliente", urlPatterns = {"/CrudCliente"})
public class CrudCliente extends HttpServlet {

   
    
     String editar="EditarCliente.jsp";
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
       
       
    if(action.equalsIgnoreCase("eliminar")){
           
           int id_cli = Integer.parseInt(request.getParameter("id"));
            
           ctrl.EliminarCliente(id_cli);
            
            
          acceso = "ListarClientes.jsp";
        
                
            }
       
       
       
        
        
       RequestDispatcher vista = request.getRequestDispatcher(acceso);
       vista.forward(request, response);
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
    
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          
         Controladora ctrl = new Controladora();
        
        
        String nombre =  request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String dni = request.getParameter("dni");
        
        
        
        Cliente cliente = new Cliente();
        cliente.setDni(dni);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setNombre(nombre);
        
        
        ctrl.crearCliente(cliente);
        
        
        
        
         RequestDispatcher vista = request.getRequestDispatcher("ListarClientes.jsp");
       vista.forward(request, response);
        
        
        
        
        
       ;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
