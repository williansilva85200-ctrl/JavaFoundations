package Desafio11a13;

import java.util.Scanner;

public class Desafio14 {
    static void main(String[] args) {
        //Desafio 2 Fibonacci
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o termo que deseja saber: ");
        int termo = sc.nextInt();
        int a = 0, b = 1, soma;

        for (int i = 1; i <= termo; i++){
            soma = a + b;
            a = b;
            b=soma;
            System.out.println(a + ", ");
        }
        sc.close();

    }
}
