/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginaeappex2;

/**
 *
 * @author starm
 */
public class ImaginaeAppEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] starter_arr = new int[1000];
        int[] second_arr = new int[100];
        
        int[] pares_arr = new int[50];
        int[] impares_arr = new int[50];
        
        int[] third_arr = new int[100];
        
        // Array que contenga un conjunto numerico del 1 al 1000
        for (int i=0; i<starter_arr.length; i++) {
            starter_arr[i] = 1+i;
//            System.out.println(starter_arr[i]);
        } 
        
        // De este array, debemos obtener los 100 últimos y asignarlos a otro Array nuevo pero en orden inverso.
        int j=0;
        for (int i = starter_arr.length-1; i >= starter_arr.length-100; i--) {
            if (j < second_arr.length) {
                second_arr[j] = starter_arr[i];
//                System.out.println(second_arr[j] + " j: " + j);
            }
            j++;
        }
        
        // Del nuevo array, extraer los impares, añadirlos a un nuevo array y hacer lo mismo con los pares.
        int m = 0; int p = 0;
        for (int i = 0; i < second_arr.length; i++) {
            if (second_arr[i]%2 == 0) {
                // número par
                pares_arr[p] = second_arr[i];
//                System.out.println("Número par: " + pares_arr[p]);
                p++;
                
            } else {
                // número impar
                impares_arr[m] = second_arr[i];
//                System.out.println("Número impar: " + impares_arr[m]);
                m++;
            }
        }
        
        
        /**
         * De estos 2 arrays, creamos un tercero en el que se 
         * multiplicarán los impares y los pares de la misma posición y 
         * sólo se añadirán aquellos que al restar 100 al resultado no sea 
         * menor que 0.
         */
        
        int t = 0;
        for (int i = 0; i < pares_arr.length; i++) {
            int multiplicacion = pares_arr[i]*impares_arr[i];
            int resta = multiplicacion - 100;
            
            if (resta >= 0) {
                third_arr[t] = resta;
                System.out.println("Tercer array - Núm. añadido: " + third_arr[t]);
                t++;
            }
        }
    }    
}
