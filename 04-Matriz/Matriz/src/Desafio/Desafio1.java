package Desafio;

import java.util.Scanner;

public class Desafio1 {
    static void main(String[] args) {
        double[] notas = new double[10];
        int posicao = 0;
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite a nota dos 10 estudantes");
            double nota = sc.nextDouble();
            soma = soma + nota;
            notas[i] = nota;
        }
        for ( double nota : notas) {
            posicao++;
            System.out.printf("\nA posição dele é %d e a sua nota foi %.2f", posicao, nota);
        }
        double media = soma / notas.length;


        System.out.println("\nA media é igual a " + media);
        sc.close();
    }
}
