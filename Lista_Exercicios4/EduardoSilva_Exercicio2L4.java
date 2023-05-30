/*Descrição: Esta lógica recebe três números, os soma e caso a soma seja diferente de 48 ou 71, ele se repete INFINITAMENTE
*Nome: Eduardo
*Data: 29/05/2023
 */

 import java.util.Scanner;
 
 public class EduardoSilva_Exercicio2L4 {
     public static void main(String[] args) {
//VARIAVEIS
        Scanner ler = new Scanner(System.in);
        int s = 0;
 
//INICIO        
         while (s != 48 && s != 71) {
             System.out.println("Digite três números: "); //O USUARIO DIGITARÁ OS 3 NÚMEROS PARA O PROGRAMA FUNCIONAR
 
             int n1 = ler.nextInt();
             int n2 = ler.nextInt();
             int n3 = ler.nextInt();
 
             s = n1 + n2 + n3;
         }
 
         System.out.println("A soma é igual a 48 ou 71.");
     }
} 
