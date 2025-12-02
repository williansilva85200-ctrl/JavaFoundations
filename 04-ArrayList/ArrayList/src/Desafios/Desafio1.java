package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio1 {
    static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Alice");
        nomes.add("Diogo");
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Willian");

        nomes.removeIf( itens -> itens.charAt(0) != 'A');
        System.out.println(nomes);
        System.out.println("A quantidade de pessoas que o nome começa com a letra A é " + nomes.size());

    }
}
