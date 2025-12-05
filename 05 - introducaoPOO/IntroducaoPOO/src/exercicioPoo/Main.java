package exercicioPoo;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoPoo aluno1 = new AlunoPoo();

        System.out.println("Digite o nome do alund");
        aluno1.nome = sc.nextLine();
        System.out.println("Digite o nota do alund");
        aluno1.nota = sc.nextDouble();
        System.out.println("Digite a nota do aluno");
        aluno1.nota2 = sc.nextDouble();

        System.out.println(aluno1.nome);
        System.out.println(aluno1.nota);
        System.out.println(aluno1.nota2);
        System.out.println(aluno1.calculaMedia());

    }
}
