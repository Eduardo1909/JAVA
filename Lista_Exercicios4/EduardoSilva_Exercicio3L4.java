/*Descrição: JAVA que soma números inteiros e reais aleatorios e ve qual é maior
*Nome: Eduardo
*Data: 29/05/2023
 */

 import java.util.Random; //programa random
 
public class EduardoSilva_Exercicio3L4 {
     public static void main(String[] args) {
//VARIAVEL
         int qn = 50;
         int si = 0;

//GERAÇÃO DOS NÚMEROS INTEIROS        
         Random rInt = new Random();
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
             System.out.println("A soma dos números inteiros é maior."); //Se a soma dos inteiros for maior que os reais
         } else if (si < sr) {
             System.out.println("A soma dos números reais é maior."); //Se a soma dos reais for maior que os inteiros
         } else {
             System.out.println("As somas dos números inteiros e reais são iguais."); //Se a soma de ambos for igual
        }
    }
}
