/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Digite o ano de nascimento: ");
        Scanner teclado = new Scanner(System.in);
        int nascimento = teclado.nextInt();
        int idade = 2016 - nascimento;
        System.out.println("Sua idade é: " + idade);
        if (idade >= 18) {
            System.out.print("Maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        } 
    }
    
}
