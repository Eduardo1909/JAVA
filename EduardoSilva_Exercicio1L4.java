/*Descrição: Esta lógica mostra todos os números até o 100, cujo o quadrado é divisível por 4, coloquei uma escala, porém da para utilizar sem ela.
*Nome: Eduardo
*Data: 29/05/2023
 */

 public class EduardoSilva_Exercicio1L4 {
    public static void main(String[] args) {

//VARIAVEIS
        int limiteSuperior = 100; 
        int soma = 0;

//INICIO
        for (int i = 1; i <= limiteSuperior; i++) {
            int quadrado = i * i;
            if (quadrado % 4 == 0) {
                soma += i;
            }
        }

        System.out.println(" " +soma);
    }
 }