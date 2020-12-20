/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable   {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empleado_generator")
    @SequenceGenerator(name="empleado_generator", sequenceName = "empleado_seq", allocationSize=50)
    private int id;
   
    @Basic
    String dni;
    String nombre;
    String apellido;
    String telefono;
    String cargo;
    
    
    @OneToOne(cascade=CascadeType.ALL)
    Usuario user;
    
    
   
     
/*
    one to one
  @JoinColumn(name="juego_id")
  Juego juego;
 
   */ 
    
    
   @ManyToOne()
    @JoinColumn(name = "juego_id")
   
    Juego juego;
    
    
    

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String telefono, String cargo, Usuario user, Juego juego) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cargo = cargo;
        this.user = user;
        this.juego = juego;
    }



    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 

   
    
    

   
  

 
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

  
  
    
    

    
 
    


    
    
    
}
