/* Descrição : Java que mostra o antecessor e sucessor de um número digitado pelo usuário
 * Autor : Eduardo
 * Ultima atualização: 17/05/2023 [] 05/17/2023
 */

import java.util.Scanner;

public class Eduardo_Exercicio05 {
    public static void main(String[]args)
        
//DECLARAÇÃO DE VARIAVEL
    Scanner ler = new Scanner(System.in);
    int a = 0;

//INICIO
    System.out.print("Digite um valor: ");
    a = ler.nextDouble();

    System.out.print("Este é seu antecessor, em seguida o que você digitou e por fim seu sucessor:");
    System.out.print(a-1);
    System.out.print(a);
    System.out.print(a+1);

}

}

}
