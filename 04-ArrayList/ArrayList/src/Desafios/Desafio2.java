package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2 {
    static void main(String[] args) {
       //Desafio 02: Soma e Média de Números
        //
        //Crie uma lista de números inteiros. Calcule a soma e a média de todos os números na lista.
        //
        //Exemplo:
        //
        //Lista de números: [10, 20, 30, 40]
        //
        //Soma: 100
        //
        //Média: 25.0

        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int i = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        while (true){
            System.out.println("Digite alguns numeros e eu farei a media deles e a sua soma [0 para parar]");
            int numeroEscolhido = sc.nextInt();
            ;
            if (numeroEscolhido == 0){
                break;
            }else{
                soma = soma + numeroEscolhido;
                numeros.add(numeroEscolhido);
                i++;
            }
        }
        for (Integer numero : numeros){
            System.out.println("Os valores da lista são " + numero);
        }
        double media = soma / i;

        System.out.println("A soma de todos os itens de sua lista é igual a " + soma);
        System.out.println("A media da lista é igual a " + media);

    }
}
