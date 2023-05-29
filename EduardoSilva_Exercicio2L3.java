/*Descrição: JAVA que mostra os números entre dois outros números
*Autor: Eduardo
*Ultima atualização: 29/05/23
*/

import java.util.Scanner;

public class EduardoSilva_Exercicio2L3 {
    public static void main(String[]args) {

//DECLARAÇÃO DE VARIAVEIS
    Scanner ler = new Scanner(System.in);
    int num = 0;
    int nois = 0;

//INICIO
    System.out.println("Digite um número: ");
    num = ler.nexInt();

    System.out.println("Digite outro número: ");
    nois = ler.nexInt();

    while (num < nois) {
    System.out.printnl (num++);
}
}
}