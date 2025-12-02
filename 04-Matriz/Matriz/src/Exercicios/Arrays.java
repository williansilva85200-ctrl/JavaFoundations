package Exercicios;

import java.util.Scanner;

public class Arrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];

        //Adicionando elementos a nota
        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 7;
        notas[3] = 8;
        notas[notas.length - 1] = 6;

        //percorrendo o array
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }

        for (int nota : notas){
            System.out.println(nota);
        }
    }
}
