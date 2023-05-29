/*Descrição: JAVA 
*Nome: Eduardo
*Data: 29/05/2023
 */

 import java.util.Random;
 import java.util.Scanner;

public class EduardoSilva_Exercicio4L4 {
            public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
        
                System.out.print("Digite um texto: ");
                String texto = ler.nextLine();
//VARIAVEL
                int qc = texto.length();
//INICIO
                if (qc > 10) {
                    System.out.println("Você digitou uma palavrão!");
                } else {
                    System.out.println("Você digitou uma palavrinha.");
                }
}
}
