package exercicios;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A:");
        double a = sc.nextDouble();
        System.out.println("Digite o lado B:");
        double b = sc.nextDouble();
        System.out.println("Digite o lado C:");
        double c = sc.nextDouble();

        boolean ladoAB = a + b > c;
        boolean ladoaC = a + c > b;
        boolean ladoBC = b + c > a;

        if (ladoAB && ladoBC && ladoaC) {
            System.out.println("É possivel formar um triangulo");
        } else {
            System.out.println("Nao é possivel formar um triangulo");


            sc.close();
        }
    }
}
