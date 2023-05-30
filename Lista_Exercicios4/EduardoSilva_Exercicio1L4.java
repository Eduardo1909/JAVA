/*Descrição: Esta lógica mostra todos os números até o 100, cujo o quadrado é divisível por 4, coloquei uma escala, porém da para utilizar sem ela.
*Nome: Eduardo
*Data: 29/05/2023
 */

 public class EduardoSilva_Exercicio1L4 {
    public static void main(String[] args) {

//VARIAVEIS
     //DECLARAÇÃO
        int ls = 100; 
        int s = 0;

//INICIO
        for (int i = 1; i <= ls; i++) {
            int q = i * i;
            if (q % 4 == 0) {
                s += i;
            }
        }

        System.out.println(" " +s);
    }
 }
