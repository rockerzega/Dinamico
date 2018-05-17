/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamico;

import Clases.Cedula;
import java.util.ArrayList;
//import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Shadow
 */
public class Dinamico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<>();
        String opcion;
        do{
            String ced = JOptionPane.showInputDialog("Ingrese cedula");
            lista.add(ced);
            opcion = JOptionPane.showInputDialog("Ingresar otro elemento s/n ");
        }while (!opcion.equalsIgnoreCase("n"));
        /* Funcionalidad con iterator en for
        for (Iterator<String> it = lista.iterator(); it.hasNext();) {
            String e = it.next();
            System.out.println(e+" ==> "+Cedula.verificar(e));
        }*/
        
        //funcionalidad con foreach
        for (String e : lista)
            System.out.println(e+" ==>> "+Cedula.verificar(e));
    }
    
}
