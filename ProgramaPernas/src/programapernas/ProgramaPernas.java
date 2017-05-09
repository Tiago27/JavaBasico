/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é o numero de pernas: ");
        int pernas = teclado.nextInt();
        String npernas;
        switch (pernas){
            case 1:
                npernas = "Saci";
                break;
            case 2:
                npernas = "Bipede";
                break;
            case 4:
                npernas = "Quadrupide";
                break;
            case 6:
            case 8:
                npernas = "Aranha";
                break;
            default:
                npernas = "ET";
        }
        System.out.println(npernas);
    }
    
}
