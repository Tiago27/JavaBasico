/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Tiago
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        
        int numero = 5;
        int valor = 5 + (numero++);//pos incremento;
        System.out.println(valor);
        numero = 5;
        valor = 5 + (++numero);
        System.out.println(valor);
        
        int numero =10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);
        
        int x = 4;
        x += 2; // x recebe x mais 2 
        System.out.println(x);
        x -= 2; // x recebe x menos 2
        System.out.println(x);
        x *= 2; // x recebe x vezes 2
        System.out.println(x);
        x /= 2;// x recebe x dividido por 2
        System.out.println(x);
        x %= 2;// x recebe modulo da divisão de x por 2
        System.out.println(x);
        
        //PI constante pi Math.PI
        System.out.println("O valor de PI é " + Math.PI);
        //pow Exponenciação Math.pow(base, expoente);
        System.out.println("5 elevado a 2 é " + Math.pow(5, 2));
        //sqrt Raiz Quadrada Math.sqrt(numero);
        System.out.println("A raiz quadrada de 25 é" + Math.sqrt(25));
        //sbrt Raiz Cubica Math.cbrt(27);
        System.out.println("A raiz cubica de 27 é " + Math.cbrt(27));
        
        //VALOR ABSOLUTO Math.abs(valor)
        int n1 = -3;
        System.out.println("O valor absoluto de -3 é " + Math.abs(n1));
        //AREDONDAMENTO PARA BAIXOMath.floor(valor)
        float n2 = 3.5f;
        System.out.println("3.5 aredondado para baixo é " + Math.floor(n2));
        //AREDONDAMENTO PARA CIMA Math.ceil(valor)
        float n3 = 3.4f;
        System.out.println("3.4 aredondado para cima é " + Math.ceil(n3));
        //AREDONDAMENTO ARITIMETICO Math.round(valor)
        System.out.println("O aredondamento aritmetico de 3.4 é " + Math.round(n3));*/
        
        //GERAR UM NUMERO RANDONICO ENTRE 0 E 1
        //System.out.println(Math.random());
        //GERAR UM NUMERO RANDONICO ENTRE 5 E 10
        double num1 = Math.random();
        int num2 = (int)(12 + num1 * (30-12));
        System.out.println(num2);
    }
    
}
