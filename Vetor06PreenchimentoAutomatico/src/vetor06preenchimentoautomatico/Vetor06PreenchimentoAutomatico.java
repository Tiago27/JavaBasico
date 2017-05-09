/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor06preenchimentoautomatico;

import java.util.Arrays;

/**
 *
 * @author Tiago
 */
public class Vetor06PreenchimentoAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero[] =new int[20];//declarando vetor 
        Arrays.fill(numero, 1);//altera o valor de todos os vetores para 1
        for (int valor: numero) {
            System.out.println(valor);
        }
    }
    
}
