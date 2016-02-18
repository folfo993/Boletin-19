/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author FOLFO
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon b = new Buzon();
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("*** MENU***\n 1-> Crear Correo\n 2-> Número de correos\n 3-> Mostrar(posición)\n 4-> Mostrar primero sin leer\n 5-> Quedan correos por leer\n 6-> Borrar correo\n 7-> Salir\\"));
        
        switch(op){
            
            case 1:
                b.añadirCorreo();
                break;
            
            case 2:
                b.numCorreos();
                break;
                
            case 3:
                b.mostrar();
                break;
            
            case 4:
                b.primeroNoLeido();
                break;
                
            case 5:
                b.noLeidos();
                
            case 6:
                b.eliminar();
                break;
                
            default:
                break;
        }
        
                 
                 
                 
                 
                 
                 
    }
    
}
