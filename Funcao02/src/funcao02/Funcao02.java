/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao02;
import java.util.Scanner;
/**
 *
 * @author Tiago
 */
public class Funcao02 {

    /**
     * @param args the command line arguments
     */
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();
       
        System.out.println("A soma dos valores é " + soma(num1, num2));
    }
    
}
