package exercicios;

import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        if (nota >= 70){
            System.out.println("Aprovado, tu é um gênio rapaz");
        } else if (nota >=50){
            System.out.println("Recuperação, vai perder o natal");
        } else {
            System.out.println("Reprovado, até ano que vem");
        }

        sc.close();


    }
}
