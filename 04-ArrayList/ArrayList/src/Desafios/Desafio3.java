package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Desafio 03: Verificar Elementos Duplicados
        //
        //Crie uma lista de números e descubra quais números são pares. Crie uma nova lista somente com os números
        //pares.
        //
        //Exemplo:
        //
        //Lista de números: [10, 20, 5, 6, 9, 5]
        //
        //Números duplicados: [10, 20,6]
        ArrayList<Integer> listaCompleta = new ArrayList<>();
        ArrayList<Integer> listaCompletaPar = new ArrayList<>();
        while (true){
            System.out.println("Digite alguns números aleatórios [0 para parar]");
            int numeroEscolhido = sc.nextInt();
            if (numeroEscolhido == 0){
                break;

            }else {
                listaCompleta.add(numeroEscolhido);
                if (numeroEscolhido % 2 == 0){
                    listaCompletaPar.add(numeroEscolhido);
                }
            }
        }
        System.out.println(listaCompleta);
        System.out.println(listaCompletaPar);


    }
}
