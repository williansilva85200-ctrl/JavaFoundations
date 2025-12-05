package exercicio;

import java.util.Scanner;

public class Aluno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a sua nota");
        double nota = sc.nextDouble();
        System.out.println("Digite a sua nota");
        double nota2 = sc.nextDouble();
        sc.nextLine();

        double media = (nota + nota2) / 2;
        System.out.println("Sua média foi de " + media);



        sc.close();
    }
}
