/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaridade3;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class VerificarIdade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int ano = teclado.nextInt();
        int idade = 2016 - ano;
        System.out.println("Sua idade é: " + idade);
        String situacao = (idade > 17)?"MAIOR DE IDADE!":"MENOR DE IDADE!";
        System.out.println("Você é " + situacao);
        if (idade <= 15) {
            System.out.println("Não vota!");
        }else if ((idade > 15 && idade <= 18)|| idade >= 71) {
                System.out.println("Voto Opcional!");
        }else if (idade >= 18 && idade <= 70){
                System.out.println("Voto Obrigatorio!");
            }
        }
    }
    

