package variaveis;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Digite um número: ");
        int numero2 = sc.nextInt();

        //operador de soma

        int soma = numero2 + numero;
        System.out.printf("O resultado da soma é %d", soma);

        //Operador de multiplicacao
        int multiplicacao = numero2 * numero;
        System.out.printf("\nO resultado da multilicacao de %d e %d é = %d", numero2, numero, multiplicacao);
        //substracao
        int substracao = numero - numero2;
        System.out.printf("\nO resultado da subtracao de %d e %d é = %d", numero2, numero, substracao);
        //divisao
        double divisao = (double) numero / numero2;
        System.out.printf("\nO resultado da subtracao de %d e %d é = %.2f", numero2, numero, divisao);
        //modulo
        int modulo = numero % numero2;
        System.out.printf("\nO resultado da subtracao de %d e %d é = %d", numero2, numero, modulo);
        sc.close();


    }
}
