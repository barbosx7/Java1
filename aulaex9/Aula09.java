
package aulaex9;

import java.util.Scanner;

/**
 * Exercício 09
 * Aula: 22/08/2023
 * Disciplina: Linguagem de Programação
 * Materia:Operadores Relacionais, Lógicos e Estruturados
 * @author Ana Luísa Chagas Barbosa
 */
public class Aula09 {
    public static void main (String[] args) {
      Scanner ler = new Scanner (System.in);
      System.out.println("Informe um valor");
      int num = ler.nextInt();
        
    if (num > 0)
    {
  
      System.out.println("Positivo");
     
    }
    else if (num < 0)
    {
      System.out.println("Negativo");
    }
    else
    {
      System.out.println("Igual 0");
    
    }
  }
}    
