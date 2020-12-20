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


@Entity
public class Juego implements Serializable  {
  
       
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "juego_generator")
    @SequenceGenerator(name="juego_generator", sequenceName = "juego_seq", allocationSize=50)
    private Long id;
   
    @Basic
    String nombreJuego;
   
    
   /* 
    @OneToOne 
    @JoinColumn(name="horario_id")*/
    
    
    @OneToOne(cascade=CascadeType.ALL)
  
    Horario horario;
 
     
  
        
           
   /* @OneToOne(mappedBy="juego")*/
    
  
    
     
   @OneToMany(mappedBy = "juego", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Empleado> empleado;
    
    
    @OneToOne(mappedBy="juego")
   
    Entrada entrada;
    

  
    public Juego() {
    }

    public Juego(Long id, String nombreJuego, Horario horario, List<Empleado> empleado, Entrada entrada) {
        this.id = id;
        this.nombreJuego = nombreJuego;
        this.horario = horario;
        this.empleado = empleado;
        this.entrada = entrada;
    }


    

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

 
  
    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }


    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }


    /*
    

    public Horario getHorariojuego() {
        return horariojuego;
    }

    public void setHorariojuego(Horario horariojuego) {
        this.horariojuego = horariojuego;
    }


*/

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    
}
