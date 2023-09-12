
package aulaex_13;

import java.util.Scanner;

/**
 * Exercício 13
 * Aula: 22/08/2023
 * Disciplina: Linguagem de Programação
 * @author Ana Luísa Chagas Barbosa
 */
public class Aula13 {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero, resto;
        
        
        System.out.println("Digite um numero inteiro");
        numero = ler.nextInt();
        
        resto = numero % 2;
        
        if (resto != 0)
      {
        System.out.println("O numero e impar");
      }
        else
      {
        System.out.println("O numero e par");
      }
    }
}
