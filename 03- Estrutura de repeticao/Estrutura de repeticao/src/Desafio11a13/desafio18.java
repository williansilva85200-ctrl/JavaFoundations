package Desafio11a13;

import java.util.Scanner;

public class desafio18 {
    static void main(String[] args) {
        //desafio 06
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int casa = 1;
        int soma = 0;
        int digito = 0;

        while (numero > 0){
            digito = (int) (numero % Math.pow(10,casa));
            numero -= digito;
            digito = (int) (digito / Math.pow(10, casa-1));
            soma+= digito;
            casa++;
        }
        System.out.println("A soma dos digitos é "+ soma);

        //outra forma
        sc.nextLine();

        System.out.println("digite um numero");
        String numero2 = sc.nextLine();

        int soma2 = 0;
        int i = 0;

        while (i < numero2.length()){
            char c = numero2.charAt(i);
            int digito2 = c - '0';
            soma2+= digito2;
            i++;
        }
        System.out.println("A soma dos digitos é igual a " + soma2);



        sc.close();

    }
}
