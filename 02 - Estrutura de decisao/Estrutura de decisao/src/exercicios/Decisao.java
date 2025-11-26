package exercicios;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSorteado = (int) (Math.random() * 10);
        System.out.println(numeroSorteado);


        int nota = 50;

        if (nota >= 70){
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");
        }
    }
}
