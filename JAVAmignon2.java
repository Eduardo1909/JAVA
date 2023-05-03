/* 
Descrição: Conjunto de algoritmos capaz de calcular média de três números digitados
Nome do autor: Eduardo E. C. Silva
Data da última atualização; 03/05/23
*/

//Importação da ferramenta Scanner (que serve como o ler)
import java.util.Scanner;

public class JAVAmignon2{

    //Declaração de variáveis
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double n1 = 0.0;
        double n2 = 0.0;
        double n3 = 0.0;

        //Leitor de números
        System.out.print("Digite o primeiro número: ");
        n1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = ler.nextDouble();

        System.out.print("Digite o terceiro número: ");
        n3 = ler.nextDouble();
        
        //Saída da média
        System.out.print("A média é: "+((n1+n2+n3)/3));
    }
}