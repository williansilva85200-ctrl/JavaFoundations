package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio5 {
    static void main(String[] args) {
        //Desafio 05: Palavras de Comprimento Par ou Ímpar
        //
        //Solicite que o usuário insira várias palavras. Ordene-as pelo comprimento (do menor para o maior) e exiba o resultado.
        //
        //Exemplo:
        //
        //Palavras inseridas: [Java, Python, App, Aplicação]
        //
        //Palavras com comprimento par: [Python, Aplicação]
        //
        //Palavras com comprimento ímpar: [Java, App]

        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavrasInseridas = new ArrayList<>();
        ArrayList<String> palavrasPares = new ArrayList<>();
        ArrayList<String> palavrasImpares = new ArrayList<>();



        while (true){
            System.out.println("Insira quantas palavras voce quiser [Acabou para finalizar]");
            String palavra = sc.nextLine();
            if (palavra.equals("Acabou")){
                break;
            } else {
                palavrasInseridas.add(palavra);
                if (palavra.length() % 2 == 0){
                    palavrasPares.add(palavra);
                }else {
                    palavrasImpares.add(palavra);
                }
            }
        }
        System.out.println("As palavras inseridas foram " + palavrasInseridas);
        System.out.println("As palavras pares são " + palavrasPares);
        System.out.println("As palavras impares são" + palavrasImpares);
    }
}
