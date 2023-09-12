
package aulaex_14;

import java.util.Scanner;

/**
 * Exercício 14
 * Aula: 22/08/2023
 * Disciplina: Linguagem de Programação
 * @author Ana Luísa Chagas Barbosa
 */
public class Aula14 {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int escolha;
        
        do
    {
        System.out.println("CARDAPIO");
        System.out.println("1 - Hamburger");
        System.out.println("2 - Chesseburguer");
        System.out.println("3 - Fritas");
        System.out.println("4 - Refrigerante");
        System.out.println("5 - Milkshake");
        System.out.println("0 - Sair");
        System.out.println("");
        escolha = scan.nextInt();
        switch (escolha)
    {
        case 1:
            System.out.println("1- Hamburguer: R$ 30,00");
            break;
            
        case 2:
            System.out.println("2- Cheeseburguer: R$ 35,00");
            break;
        
        case 3:
            System.out.println("3- Fritas: R$ 20,00");
            break;
            
        case 4:
            System.out.println("4- Refrigerante: R$ 10,00");
            break;
            
        case 5:
            System.out.println("5- Milkshake: R$ 30,00");
            break;
        default:
            System.out.println("Opcao invalida");
            break;
    }
    System.out.println("-------------------------------");  
    }        
    while (escolha != 0); 
        
    }  
  }  

