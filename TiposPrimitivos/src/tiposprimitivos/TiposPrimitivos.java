/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //primeiro nome do scanner, segundo new cria um novo objeto de entrada de dados
        System.out.print("Digite o nome do aluno:");
        String nome = entrada.nextLine();
        System.out.print("Digite a nota do aluno:");
        float nota =  entrada.nextFloat();
        //maneiras de imprimir um valor na tela
        System.out.println("Seu nome é "+ nome +" sua nota é " + nota);
        System.out.print("Sua nota é "+ nota + "\n");
        System.out.printf("Seu nome é %s sua nota é %.2f \n", nome, nota);
        System.out.format("Sua nota é %.2f \n", nota);
        
        System.out.println("");
    }

  
    
}
