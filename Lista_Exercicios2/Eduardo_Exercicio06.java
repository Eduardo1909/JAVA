/* Descrição : Java para a compra da senhora Jumiralds
 * Autor : Eduardo
 * Ultima atualização : 17/05/2023 [] 05/17/2023
 */

 import java.util.Scanner;

public class Eduardo_Exercicio06 {
    public static void main(String[]args)
     
//DECLARAÇÃO DE VARIAVEL
    Scanner ler = new Scanner(System.in);
    int k = 0;
    int l = 0;
    int r = 0;
 
//INICIO
    System.out.print("Digite a quantia de sorvetes de Kiwi, Laranja e Romã qua a pessoa comprou: ");
    k = ler.nextDouble();
    l = ler.nextDouble();
    r = ler.nextDouble();

    System.out.print("O valor que deu foi de: R$");
    System.out.print((k*3.2)+(l*2.39)+(r*7.99));

}

    
}
