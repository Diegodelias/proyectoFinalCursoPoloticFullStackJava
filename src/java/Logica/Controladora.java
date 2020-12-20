/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import Persistencia.exceptions.NonexistentEntityException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controladora {
    
    ControladoraPersistencia ctrlPersist = new  ControladoraPersistencia();
    
    private List <Usuario> listaUsuarios;
    

    
    
       public void crearJuego(Juego juego) {
        try {
            
          ctrlPersist.juegoJPA.create(juego);
                    } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       
       
       
      public void crearHorario(Horario horario) {
        try {
            
          ctrlPersist.horaJPA.create(horario);
                    } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      
      public List <Juego> getListaJuegos(){
          
          
          return ctrlPersist.getListaJuegos();
      }

    public Juego TaerJuegoEnParticular(Long id) {
        
        return ctrlPersist.TaerJuegoEnParticular(id);
        
    }
       
    
    
    
       public void crearEmpleado(Empleado emple) {
        try {
            
          ctrlPersist.empleadoJPA.create(emple);
                    } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
       
           
       public void crearuUsuario(Usuario user) {
        try {
            
          ctrlPersist.usuarioJPA.create(user);
                    } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
       
          public List <Empleado> getListaEmpleados(){
          
          
          return ctrlPersist.getListaEmpleados();
      }

    
       public Empleado TaerEmpleadoEnParticular(int id) {
        
        return ctrlPersist.TaerEmpleadoEnParticular(id);
        
    }
    
       
       
       
         public void editarEmpleado(Empleado emple) {
             
             
        try {
            ctrlPersist.empleadoJPA.edit(emple);
        } catch (Exception ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             
         }
         
         
         
         public void EliminarEmpleado(int id){
             
             
             ctrlPersist.EliminarEmpleado(id);
    
    
}
         
         
               
       public void crearCliente(Cliente cli) {
       
            
          ctrlPersist.crearCliente(cli);
        
       }
    
       
       
       
       
      public List <Cliente> getListaClientes(){
          
          
          return ctrlPersist.getListaClientes();
      }

      
      
      
       public Cliente TaerClienteEnParticular(int id) {
        
        return ctrlPersist.TaerClienteEnParticular(id);
        
    }

       
       
       
      public void editarCliente(Cliente cli) {
             
             
        try {
            ctrlPersist.editarCliente(cli);
        } catch (Exception ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             
         }
      
      
      
      
        public void EliminarCliente(int id){
             
             
             ctrlPersist.EliminarCliente(id);
    
    
}
         
        
        
       public void crearEntrada(Entrada entrada) {
        try {
            
          ctrlPersist.crearEntrada(entrada);
                    } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
       
        
      public boolean comprobarLogin(String usuario, String pass){
          
          boolean siOno = false;
          listaUsuarios = ctrlPersist.getListaUsuarios();
          
          for (Usuario usu : listaUsuarios){
              if(usu.getNombreUsuario().equals(usuario) && usu.getContrasenia().equals(pass)){
                  
                  siOno = true;
                  return siOno;
                  
              }
              
              
          }
          
          
          return siOno;
          
          
      }
      
      
      
      public void editarJuego(Juego juego){
          
          
          ctrlPersist.editarJuego(juego);
      }

    public void EliminarJuego(long idJu) {
        ctrlPersist.EliminarJuego(idJu);
    }
       
       
    
    
    
     public List <Entrada> getListaEntradas(){
          
          
          return ctrlPersist.getListaEntradas();
      }

    public void EliminarEntrada(int id) {
       
        try {
            ctrlPersist.EliminarEntrada(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

      



}