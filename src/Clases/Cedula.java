/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Shadow
 */
public class Cedula {
    private static int suma10(int n){
        int x = n;
        if(n>9)
            x = (n-10)+1;
        return x;
    }
    
    public static String verificar(String cedula){
        String resul="Incorrecto";
        
        if(cedula.length()==10){
            int suma=0;
            for(int i = 0; i <= 8; i++){
                int c = Character.getNumericValue(cedula.charAt(i));
                if (i%2==0)
                    suma+=suma10(2*c);
                else
                    suma+=c;
            }
            int ver = ((int)(suma/10)+1)*10;
            ver-=suma;
            if (ver==Character.getNumericValue(cedula.charAt(9)))
                resul = "Correcto";
        }
        return resul;
    }
    
}
