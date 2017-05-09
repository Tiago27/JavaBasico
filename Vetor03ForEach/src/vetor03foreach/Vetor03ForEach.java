/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03foreach;

import java.util.Arrays;

/**
 *
 * @author Tiago
 */
public class Vetor03ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero[]={4,8,2,8,1};
        Arrays.sort(numero);//Ordena o vetor
        for(int valor: numero){
            System.out.println(valor);
        }
    }
    
}
