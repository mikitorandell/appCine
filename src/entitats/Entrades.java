package entitats;
// Generated 20-may-2013 11:53:27 by Hibernate Tools 3.2.1.GA



/**
 * Entrades generated by hbm2java
 */
public class Entrades  implements java.io.Serializable {


     private Integer idEntrada;
     private Butaques butaques;
     private Tarifas tarifas;
     private Pase pases;

    public Entrades() {
    }

    public Entrades(Butaques butaques, Tarifas tarifas, Pase pases) {
       this.butaques = butaques;
       this.tarifas = tarifas;
       this.pases = pases;
    }
   
    public Integer getIdEntrada() {
        return this.idEntrada;
    }
    
    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }
    public Butaques getButaques() {
        return this.butaques;
    }
    
    public void setButaques(Butaques butaques) {
        this.butaques = butaques;
    }
    public Tarifas getTarifas() {
        return this.tarifas;
    }
    
    public void setTarifas(Tarifas tarifas) {
        this.tarifas = tarifas;
    }
    public Pase getPases() {
        return this.pases;
    }
    
    public void setPases(Pase pases) {
        this.pases = pases;
    }




}


