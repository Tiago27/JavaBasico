/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadordecambalhotas;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class ContadorDeCambalhotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número de cambalhotas: ");
        int numeroCambalhotas = teclado.nextInt();
        int c = 0; 
        while (c < numeroCambalhotas) {      
            c++;
            if (c == 5 || c == 7) {
                continue;//volta para o teste lógico
            }
            if (c==9) {
                break;//enterrompe o laço
            }
            System.out.println(c + " cambalhota");
        }
        
        
    }
    
}
