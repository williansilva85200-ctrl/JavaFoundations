package Desafio11a13;

import java.util.Scanner;

public class Desafio11a13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Desafio 11 criar um programa que some 6 valores digitados pelo usuário
        //porém o programa so vai somar valores impares e multiplos
        int soma = 0;
        for (int i = 1; i <= 1; i++){
            System.out.println("Digite um número, e farei somente a soma daqueles que multiplos de 3 e impares");
            int numeros = sc.nextInt();
            int resto = numeros % 2;
            if (resto == 1 && numeros % 3 == 0){
                soma+= numeros;

            }
        }
        System.out.println("o resultado do soma dos itens impares e multiplos de 3 é " + soma);

        //DESAFIO 12
        //Crie um programa desafiando a máquina
        //A máquina vai gerar um número entre 0 a 100 e você vai tentar acertar esse numero
        //O programa só vai encerrar quando você acertar, informe se o valor que o usuário digitou
        // a maior ou menor o que a gerou



        int numeroSorteado = (int) (Math.random() * 101);
        System.out.println("O numero sorteado é "+ numeroSorteado);
        int i = 0;
        while (true){
            System.out.println("Tire um x1 com a maquina, voce terá que tentar adivinhar o numero escolhido por ela");
            int numeroEscolhido = sc.nextInt();
            i++;
            if (numeroSorteado == numeroEscolhido){
                System.out.println("PARABENS, VOCE ACERTOU EM "+ i + " tentativas");
                break;
            }else if (numeroSorteado > numeroEscolhido){
                System.out.println("O Numero sorteado é maior que " + numeroEscolhido);

            }else {
                System.out.println("O Numero sorteado é menor que " + numeroEscolhido);
            }
        }


        //Desafio 1: Fatorial de um Número
        //
        //Peça ao usuário um número inteiro positivo e, usando um for, calcule o fatorial desse número.

        System.out.println("Digite um numero inteiro positivo");
        int numeroInteiro = sc.nextInt();
        int numeroNovo = numeroInteiro;

        for (i = numeroNovo; i != 1; i--){
            numeroInteiro *= i - 1;


        }
        System.out.println("O valor após a faturação é " + numeroInteiro);



    }

}
