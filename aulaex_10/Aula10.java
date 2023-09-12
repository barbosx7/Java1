
package aulaex_10;

import java.util.Scanner;

/**
 * Exercício 10
 * Aula: 22/08/2023
 * Disciplina: Linguagem de Programação
 * @author Ana Luísa Chagas Barbosa

 */
public class Aula10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int escolha;
        
        
    do{
        System.out.println("Menu");
        System.out.println("1. Opção 1");
        System.out.println("2. Opção 2");
        System.out.println("3. Opção 3");
        System.out.println("0. Sair");
        System.out.println("Escolha");
        escolha = scanner.nextInt();
        
        switch  (escolha)
     {  
        case 1:
        System.out.println("Voce escolheu a opção 1.");
        break;
        
        case 2:
        System.out.println("Voce escolheu a opção 2.");
        break;
        
        case 3:
        System.out.println("Voce escolheu a opção 3.");
        break;
        
        case 0:
        System.out.println("Saindo do Programa...");
        break;
        
        default:
        
        System.out.println("Opção Inválida");
        break;
         
     }
        System.out.println();
        
     } while (escolha != 0);
    }
}
