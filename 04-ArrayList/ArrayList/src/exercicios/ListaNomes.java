package exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaNomes {
    static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        //Adicionar valores a ArrayList
        nomes.add("Pedro");
        nomes.add("Diego");
        nomes.add("Maria");

        //Adicionar valor em uma posição especifica
        nomes.add(1, "Enzo");
        nomes.add(2, "Nathan");


        //Verificar um item da lista
        System.out.println(nomes.get(0));

        //Alterar um valor na lista
        nomes.set(0, "JOAO");

        //Retornar a posição a partir dp valor
        System.out.println(nomes.indexOf("Pedro"));
        System.out.println(nomes.indexOf("Joao"));

        //Remover elemento

        nomes.remove("Maria");
        nomes.remove(1);

        //Verificar o tamanhp da lista

        System.out.println(nomes.size());

        //removeIf

        nomes.removeIf(itens -> itens.charAt(0) == 'J');

        //como percorrer

        for (String nome : nomes){
            System.out.println(nome);
        }


        System.out.println(nomes);


    }
}
