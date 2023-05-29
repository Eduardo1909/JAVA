/* Descrição : Java que inverte valores
 * Autor : Eduardo
 * Ultima atualização : 17/05/2023 [] 05/17/2023
 */

 import java.util.Scanner;

public class Eduardo_Exercicio04 {
    public static void main(String[]args)
     
//DECLARAÇÃO DE VARIAVEL
    Scanner ler = new Scanner(System.in);
    int a = 0;
    int b = 0;
    int c = 0;

//INICIO
    System.out.print("Digite o valor de A: ");
    a = ler.nextDouble();
    System.out.print("Digite o valor de B: ");
    b = ler.nextDouble();

    c = a;
    a = b;
    b = c;

    System.out.print("Este é o valor de A e em seguida o de B:");
    System.out.print(a);
    System.out.print(b);

}

}
