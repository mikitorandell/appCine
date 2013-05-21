package entitats;
// Generated 21-may-2013 14:29:12 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pase generated by hbm2java
 */
public class Pase  implements java.io.Serializable {


     private Integer idPase;
     private Sala sala;
     private Pelicula pelicula;
     private Date dia;
     private Date hora;
     private Set entradas = new HashSet(0);

    public Pase() {
    }

	
    public Pase(Sala sala, Pelicula pelicula, Date dia, Date hora) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.dia = dia;
        this.hora = hora;
    }
    public Pase(Sala sala, Pelicula pelicula, Date dia, Date hora, Set entradas) {
       this.sala = sala;
       this.pelicula = pelicula;
       this.dia = dia;
       this.hora = hora;
       this.entradas = entradas;
    }
   
    public Integer getIdPase() {
        return this.idPase;
    }
    
    public void setIdPase(Integer idPase) {
        this.idPase = idPase;
    }
    public Sala getSala() {
        return this.sala;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public Pelicula getPelicula() {
        return this.pelicula;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Date getDia() {
        return this.dia;
    }
    
    public void setDia(Date dia) {
        this.dia = dia;
    }
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public Set getEntradas() {
        return this.entradas;
    }
    
    public void setEntradas(Set entradas) {
        this.entradas = entradas;
    }




}

