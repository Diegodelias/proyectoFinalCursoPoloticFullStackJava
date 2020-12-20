/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Horario implements Serializable   {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "horario_generator")
    @SequenceGenerator(name="horario_generator", sequenceName = "horario_seq", allocationSize=50)
    private Long id;
   
    
    @Temporal(TemporalType.TIME)
    Date hora_inicio;

    @Temporal(TemporalType.TIME)
    Date hora_fin;
    
    /*
    @OneToOne(mappedBy="horario")
    Juego juego;

*/
    


    public Horario() {
    }

    public Horario(Long id, Date hora_inicio, Date hora_fin, Juego juego) {
        this.id = id;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
       
    }

   
  
    
    
    

    
  

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  
    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Date hora_fin) {
        this.hora_fin = hora_fin;
    }
    
    
    
    
    
}
