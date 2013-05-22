package entitats;
// Generated 21-may-2013 14:29:12 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Genere generated by hbm2java
 */
public class Genere  implements java.io.Serializable {


     private Integer id;
     private String titol;
     private Set<Pelicula> peliculas = new HashSet<Pelicula>(0);

    public Genere() {
    }

    public Genere(String titol, Set peliculas) {
       this.titol = titol;
       this.peliculas = peliculas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitol() {
        return this.titol;
    }
    
    public void setTitol(String titol) {
        this.titol = titol;
    }
    public Set getPeliculas() {
        return this.peliculas;
    }
    
    public void setPeliculas(Set peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
       return this.titol;
    }

    


}


