/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FOLFO
 */
public class Buzon {
    
    ArrayList <Correo> correo = new ArrayList<>();
    
    public Buzon(){
    }
    
    public void numCorreos(){
        int tamaño = correo.size();
        System.out.println("Numero de Correos: "+tamaño);
    }
    
    public void añadirCorreo(){
        String nuevo = JOptionPane.showInputDialog("Nuevo correo: ");
        correo.add(new Correo(nuevo, 0));
    }
    
    public void noLeidos(){
        for(int i=0; i<correo.size(); i++)
            if(correo.get(i).getLeido()==0){
                System.out.println("Hay correos por leer");
                break;
            }    
    }
    
    public void primeroNoLeido(){
        
        for(int i=0; i<correo.size(); i++)
            if(correo.get(i).getLeido()==0){
                System.out.println("Primer correo sin leer: " +correo.get(i));
                break; 
            }
    }
    
    public void mostrar(){
        int k = Integer.parseInt(JOptionPane.showInputDialog("Posición: "));
        String c = correo.get(k).getContenido();
        System.out.println("Correo en esa posicion:"+c);
    }
    
    public void eliminar(){
        int k = Integer.parseInt(JOptionPane.showInputDialog("Posición: "));
        correo.remove(k);
    }
    
}
