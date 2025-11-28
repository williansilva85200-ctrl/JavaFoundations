package Desafio11a13;

import java.util.Scanner;

public class Desafio14 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite em qual parte da sequencia de Fibonacci voce quer parar");
        int localizacao = sc.nextInt();
        int lugarEscolhido = localizacao;
        int base = 0;
        for ( int i = 1; i != lugarEscolhido; i++){
            base += (i + base);
            System.out.println(base);
        }

    }
}
