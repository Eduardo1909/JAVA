/* Descroção: Algoritmo que recebe 3 números e mostra o maior
 * Autor: Eduardo
 * Ultima edição: 16/05/2023
 */

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Eduardo_Exercicio02 {
    
    public static void main (String[]args)

//DECLARAÇÃO DE VARIAVEL        
    Scanner ler = new Scanner (System.in)
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;

//INICIO    
    System.out.print("Digite três números: ");
    n1 = ler.nextdouble();
    n2 = ler.nextdouble();
    n3 = ler.nextdouble();

//IF e ELSE    
    if(n1>n2 && n1>n3)
    {}
    else {
        System.out.print("O número maior é:")
        System.out.print(n1)
}
    if(n2>n1 && n2>n3){}
    else{ System.out.print("O número maior é:")
    System.out.print(n2)
}
    if(n3>n1 && n3>n2){}
    else{ System.out.print("O número maior é:")
    System.out.print(n3)
}
}


