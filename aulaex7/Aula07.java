
package aulaex7;

import java.util.Scanner;

/**
 * Exercício 07
 * Aula: 15/08/2023
 * Disciplina: Linguagem de Programação
 * Materia: Entrada de Dados
 * @author Ana Luísa Chagas Barbosa
 */
public class Aula07 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Qual nome do Aluno?");
        String nome = ler.next();
        
        System.out.println("Qual a primeira nota?");
        float nota1 = ler.nextFloat();
        System.out.println("Qual a segunda nota?");
        float nota2 = ler.nextFloat();
        System.out.println("Qual a terceira nota?");
        float nota3 = ler.nextFloat();
        System.out.println("Qual a quarta nota?");
        float nota4 = ler.nextFloat();
        float soma = nota1 + nota2 + nota3 + nota4;
        float media = soma / 4;
        System.out.println ("A media:" + media);

        
       
        
                
    }
    
}
