package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite uma nota: ");
            double nota = sc.nextDouble();

            System.out.println("Digite outra nota");
            double nota2 = sc.nextDouble();

            double media = (nota  + nota2) / 2;

            System.out.println("A sua média foi de" + media);
        } catch (InputMismatchException e) {
            System.out.println("Erro informe um valor númerico");
        }



        sc.close();
    }
}
