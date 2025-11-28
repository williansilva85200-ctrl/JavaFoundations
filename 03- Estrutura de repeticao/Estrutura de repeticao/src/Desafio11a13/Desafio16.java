package Desafio11a13;

import java.util.Scanner;

public class Desafio16 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Desafio 4: Número Par ou Ímpar com WHILE
        //
        //Solicite números ao usuário, informando se são pares ou ímpares, e acumule as somas de números pares e de números impares.
        //O programa encerra ao receber 0, exibindo as somas totais de pares e ímpares.
        while (true){
            System.out.println("Digite um numero par ou impar, [0 para parar]");
            int numeroEscolhido = sc.nextInt();
            int resto = numeroEscolhido % 2;
            int somaPar = 0;
            int somaImpar = 0;
            if (numeroEscolhido == 0){
                break;
            }else if (resto == 1){
                somaImpar = numeroEscolhido + somaImpar;
            }else {
                somaPar = numeroEscolhido + somaPar;
            }
            System.out.println(somaPar + somaImpar);




        }

    }
}
