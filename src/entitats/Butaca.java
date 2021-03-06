package entitats;
// Generated 21-may-2013 14:29:12 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Butaca generated by hbm2java
 */
public class Butaca implements java.io.Serializable {


     private String id;
     private TipusSala tipusSala;
     private String fila;
     private Set entradas = new HashSet(0);

    public Butaca() {
    }

	
    public Butaca(String id, TipusSala tipusSala, String fila) {
        this.id = id;
        this.tipusSala = tipusSala;
        this.fila = fila;
    }
    public Butaca(String id, TipusSala tipusSala, String fila, Set entradas) {
       this.id = id;
       this.tipusSala = tipusSala;
       this.fila = fila;
       this.entradas = entradas;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public TipusSala getTipusSala() {
        return this.tipusSala;
    }
    
    public void setTipusSala(TipusSala tipusSala) {
        this.tipusSala = tipusSala;
    }
    public String getFila() {
        return this.fila;
    }
    
    public void setFila(String fila) {
        this.fila = fila;
    }
    public Set getEntradas() {
        return this.entradas;
    }
    
    public void setEntradas(Set entradas) {
        this.entradas = entradas;
    }




}


