/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Cliente;
import Logica.Empleado;
import Logica.Entrada;
import Logica.Horario;
import Logica.Juego;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class ControladoraPersistencia {
    
  
    
    public ClienteJpaController clienteJPA = new ClienteJpaController();
    
    
   public EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    
    public EntradaJpaController entradaJPA = new EntradaJpaController();
    
    public HorarioJpaController horaJPA = new HorarioJpaController();
    
    public JuegoJpaController juegoJPA = new  JuegoJpaController();
    
   public UsuarioJpaController usuarioJPA = new UsuarioJpaController();

 
    
    
    
          
      public List<Juego> getListaJuegos(){
          
          List <Juego> listaJuegos;
          listaJuegos =  juegoJPA.findJuegoEntities();
          
          
          return  listaJuegos;
          
          
         
      }
      
      
      
      
      public Juego TaerJuegoEnParticular(Long id){
          
        return  juegoJPA.findJuego(id);
     
      }

    public List<Empleado> getListaEmpleados() {
      
       
          List <Empleado> listaEmpleados;
          listaEmpleados =  empleadoJPA.findEmpleadoEntities();
          
          
          return  listaEmpleados;
    
    
    
}

    
    
      public Empleado TaerEmpleadoEnParticular(int id){
          
        return  empleadoJPA.findEmpleado(id);
     
      }
      
      
          
      public void EditarEmpleado(Empleado emple){
          
        try {
            empleadoJPA.edit(emple);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
     
      }
      
      
      
      
      public void EliminarEmpleado(int id){
          
       
        try {
            empleadoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      }
      
      
      
            
       public void crearCliente(Cliente cliente) {
     
        try {
            clienteJPA.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
         
                   
        
    }

    public List<Cliente> getListaClientes() {
        
        List <Cliente> listaClientes;
          listaClientes =  clienteJPA.findClienteEntities();
          
          
          return  listaClientes;
    
        
    }

    public Cliente TaerClienteEnParticular(int id) {
       
        return clienteJPA.findCliente(id);
    }
    
    public void editarCliente(Cliente cli){
        
        try {
            clienteJPA.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

 

    public void crearEntrada(Entrada entrada) {
         
        try {
            entradaJPA.create(entrada);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    
    
    
      public List<Usuario> getListaUsuarios() {
      
       
          List <Usuario> listaUsuarios;
          listaUsuarios =  usuarioJPA.findUsuarioEntities();
          
          
          return  listaUsuarios;
    
    
    
}

   

    public void editarJuego(Juego juego) {
        try {
            juegoJPA.edit(juego);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarJuego(long idJu) {
        try {
            juegoJPA.destroy(idJu);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Entrada> getListaEntradas() {
        
         List <Entrada> listaEntradas;
         
         
         listaEntradas =  entradaJPA.findEntradaEntities();
        
        
        
        
        return listaEntradas;
        
    }


    public void EliminarEntrada(int id) throws NonexistentEntityException {
           
        entradaJPA.destroy(id);
    }

    public void EliminarCliente(int id) {
        try {
            clienteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}