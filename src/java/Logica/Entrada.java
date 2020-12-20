/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Entrada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_generator")
    @SequenceGenerator(name="cliente_generator", sequenceName = "cliente_seq", allocationSize=50)
  
    int id;
    @Basic
    String nombre_cliente;
    String apellido_Cliente;
    @Temporal(TemporalType.DATE)
    Date fecha;
    
   /* @OneToOne
    Juego juego;
    
    
    
*/

  @JoinColumn(name="juego_id")
   @OneToOne(fetch = FetchType.LAZY)
  Juego juego;
 
  
  
 
   
           
    @JoinColumn(name = "cliente_id")
    @OneToOne(fetch = FetchType.LAZY)
    
    Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
  
  
    
    
  /* @JoinColumn(name="cliente_id_cliente")
   @OneToOne(fetch = FetchType.LAZY)*/
     

 
    public Entrada() {
    }

    public Entrada(int id, String nombre_cliente, String apellido_Cliente, Date fecha, Juego juego, Cliente cliente) {
        this.id = id;
        this.nombre_cliente = nombre_cliente;
        this.apellido_Cliente = apellido_Cliente;
        this.fecha = fecha;
        this.juego = juego;
  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


   
  

   
 
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }


    public String getApellido_Cliente() {
        return apellido_Cliente;
    }

    public void setApellido_Cliente(String apellido_Cliente) {
        this.apellido_Cliente = apellido_Cliente;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




    
    
    

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    
    
    
}
