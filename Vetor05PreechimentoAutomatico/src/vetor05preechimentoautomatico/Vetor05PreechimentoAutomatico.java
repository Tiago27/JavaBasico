/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05preechimentoautomatico;

import java.util.Arrays;

/**
 *
 * @author Tiago
 */
public class Vetor05PreechimentoAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero[] ={3,4,5,6,7};
        Arrays.fill(numero, 1);//altera o valor de todos os vetores para 1
        for (int valor: numero) {
            System.out.println(valor);
        }
    }
    
}
