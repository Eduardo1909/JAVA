/* Descrição: Algoritmo que captura um valor inserido pelo usuário e desconte 15% dp valor inserido
 * Autor: Eduardo Silva
 * Ultima edição: 16/05/2023
 */

import java.util.Scanner;

public class Eduardo_Exercicio01 {
    public static void main(String[]args)
//DECLARAÇÃO DE VARIAVEL        
    Scanner ler = new Scanner(System.in);
    double n1 = 0.0;

//INICIO
    System.out.print("Digite o valor que deseje aplicar o desconto: ");
    n1 = ler.nextDouble();
    
    System.out.print("O valor com desconto é:" +(n1-((n1/100)*15));
}
    
}
