/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao03;

/**
 *
 * @author Tiago
 */
public class OperacaoJava {
    
   public static String contador (int i, int f){
        String s="";
        for(int c = i; c <= f; c++){
            s += c + " ";
        }
        return s;
    }
}
