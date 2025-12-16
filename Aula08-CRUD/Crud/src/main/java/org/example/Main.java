package org.example;


import org.example.entidades.Aluno;
import org.example.entidades.GerenciarAlunos;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        Aluno aluno1 = new Aluno("Diego", 10,10);
        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("MENU OPCOES");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Aluno");
            System.out.println("3 - Atualizar Aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Sair Aluno");
            System.out.println("Escolha uma opcao");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    sc.nextLine();
                    System.out.println("digite o seu nome");
                    String nome = sc.nextLine();

                    System.out.println("Digite a nota do aluno");
                    double nota = sc.nextDouble();

                    System.out.println("Digite a outra nota do Aluno");
                    double nota2 = sc.nextDouble();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.cadastrarAluno(aluno);
                }
                case 2 -> {
                    gerenciarAlunos.listarALunos();
                }
                case 3 -> {
                    gerenciarAlunos.listarALunos();
                    System.out.println("Digite o id do aluno que deseja atualizar");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("digite o seu nome");
                    String nome = sc.nextLine();

                    System.out.println("Digite a nota do aluno");
                    double nota = sc.nextDouble();

                    System.out.println("Digite a outra nota do Aluno");
                    double nota2 = sc.nextDouble();

                    gerenciarAlunos.alterarALuno(id, nome, nota, nota2);
                }
                case 4 -> {
                    gerenciarAlunos.listarALunos();
                    System.out.println("Digite o id do aluno que voce deseja excluir");
                    int id = sc.nextInt();
                    sc.nextLine();

                    gerenciarAlunos.excluirAluno(id);
                }
                case 5 -> {
                    System.out.println("Saiu do programa com sucesso");
                    return;

                }
            }
        }

    }

}
