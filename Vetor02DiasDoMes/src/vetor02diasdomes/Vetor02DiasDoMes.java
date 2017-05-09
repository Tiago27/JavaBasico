/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02diasdomes;
import java.util.Scanner;
/**
 *
 * @author Tiago
 */
public class Vetor02DiasDoMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[]={"Jan", "Fer", "Mar", "Abr", "Mai", "Jun",
                      "Jul", "Ago", "Ser", "Out", "Nov", "Dez"};
        int dias[]={31, 28, 31, 30, 31, 30, 
                   31, 30, 31, 31, 30, 31};
        System.out.print("Informe o ano: ");
        Scanner teclado = new Scanner(System.in);
        int anoAtual = teclado.nextInt();
        String ano = ((anoAtual%4== 0) && (anoAtual != 1900))?"bissexto":"nao bissexto";
        for (int contador = 0; contador < mes.length; contador++) {
            if (contador == 1) {
                if (ano.equals("bissexto")) {
                dias[1] = 29;
            }
            }
            
            System.out.println("O mês " + mes[contador] + 
                               " tem " + dias[contador] + " dias");
        }
    }
    
}
