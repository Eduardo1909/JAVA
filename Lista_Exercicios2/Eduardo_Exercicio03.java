/* Descrição: Java que calcula a área de um triangulo
 * Autor : Eduardo
 * Ultima atualização: 17/05/2023 [] 05/17/2023
 */

 import java.util.Scanner;

public class Eduardo_Exercicio03 {

    public static void main(String[]args)
    Scanner ler = new Scanner(System.in);
    int a = 0;
    int al = 0;
    int ba = 0;

    System.out.print("Digite o valor da altura: ");
    al = ler.nextDouble();
    System.out.print("Digite o valor da altura: ");
    al = ler.nextDouble();

    System.out.print("A área do triangulo é:" +((al*ba)/2));
}

}
