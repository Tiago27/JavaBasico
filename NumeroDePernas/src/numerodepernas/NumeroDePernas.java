/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodepernas;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class NumeroDePernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é o numero de pernas: ");
        int pernas = teclado.nextInt();
        
        switch (pernas){
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bipede");
                break;
            case 4:
                System.out.println("Quadrupide");
                break;
            case 6:
            case 8:
                System.out.println("Aranha");
                break;
            default:
                System.out.println("ET");
        }
    }
    
}
