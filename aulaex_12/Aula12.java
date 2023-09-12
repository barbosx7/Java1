
package aulaex_12;

import java.util.Scanner;

/**
 * Exercício 12
 * Aula: 22/08/2023
 * Disciplina: Linguagem de Programação
 * @author Ana Luísa Chagas Barbosa
 */
public class Aula12 {
    public static void main (String[] args)
{
    Scanner ler = new Scanner (System.in);
    int idade;
    
    System.out.println("Qual sua idade: ");
    idade = ler.nextInt();
    
    if (idade >= 18)
{
    System.out.println("Maior de idade: ");
}
    else
{
    System.out.println("Menor de idade: ");
}
}            
}
