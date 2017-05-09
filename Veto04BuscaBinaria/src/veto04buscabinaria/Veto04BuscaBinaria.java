/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veto04buscabinaria;

import java.util.Arrays;

/**
 *
 * @author Tiago
 */
public class Veto04BuscaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero[] ={1, 3, 5, 67, 76, 45, 43, 98, 100};
        for (int valor:numero) {
         //Mostra os elementos dos vetores
            System.out.println(valor);
        }
        int posicao = Arrays.binarySearch(numero, 67);
        System.out.println("Encontreo valor  na posição "+ posicao);
    }
    
}
