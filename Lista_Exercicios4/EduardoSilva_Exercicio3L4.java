/*Descrição: JAVA 
*Nome: Eduardo
*Data: 29/05/2023
 */

 import java.util.Random;
 
public class EduardoSilva_Exercicio3L4 {
     public static void main(String[] args) {
//VARIAVEL
         int qn = 50;
         int si = 0;

//GERAÇÃO DOS NÚMEROS INTEIROS        
         Random randomInt = new Random();
         for (int i = 0; i < qn; i++) {
             int ni = randomInt.nextInt();
             si += ni;
         }
 
//GERAÇÃO DOS NÚMEROS REAIS
         double somaReais = 0.0;
         Random randomDouble = new Random();
         for (int i = 0; i < qn; i++) {
             double nr = randomDouble.nextDouble();
             sr += nr;
         }
 
// CCOMPARAÇÃO DAS SOMAS
         System.out.println("A soma dos números inteiros é: " + si);
         System.out.println("A soma dos números reais é: " + sr);
 
         if (si > sr) {
             System.out.println("A soma dos números inteiros é maior.");
         } else if (si < sr) {
             System.out.println("A soma dos números reais é maior.");
         } else {
             System.out.println("As somas dos números inteiros e reais são iguais.");
        }
    }
}
