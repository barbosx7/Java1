
package aulaex8;

/**
 * Exercício 08
 * Aula: 15/08/2023
 * Disciplina: Linguagem de Programação
 * Materia: Operadores Relacionais, Lógicos e Estruturas Condicionais
 * @author Ana Luísa Chagas Barbosa
 */
public class Aula08 {
    public static void main (String[] args){
        int a = 10;
        int b = 5;
        
        System.out.println(a > b && a < b);
        
        if (a > b){
            System.out.println("Maior");
        }else if (a < b) {
            System.out.println("Menor");
        }else{
            System.out.println("Igual");
        }
    }
    
}
