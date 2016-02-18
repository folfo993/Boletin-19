/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author FOLFO
 */
public class Correo {
    private String contenido;
    private int leido;
    
    public Correo(){
    }

    public Correo(String contenido, int leido) {
        this.contenido = contenido;
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getLeido() {
        return leido;
    }

    public void setLeido(int leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Correo{" + "contenido=" + contenido + ", leido=" + leido + '}';
    }
   
    
}
