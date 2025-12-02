package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio4 {
    static void main(String[] args) {
        //Desafio 04: Remove Palavras que Contêm um Caracter Específico
        //
        //Crie uma lista de palavras e remova todas que contêm uma letra específica fornecida pelo usuário.
        //
        //Exemplo:
        //
        //Palavras originais: [Banana, Maçã, Abacate, Manga]
        //
        //Removendo palavras que contêm “a": []

        Scanner sc = new Scanner(System.in);
        ArrayList <String> palavras = new ArrayList<>();


        while (true){
            System.out.println("Faça uma lista de palavras [Digite: Acabou para parar de escrever novas palavras");
            String palavra = sc.nextLine();
            if (palavra.equals("Acabou")){
                break;
            }else{
                palavras.add(palavra);
            }
        }
        System.out.println("Agora digite a letra especifica que voce nao quer em sua lista");
        String letraEscolhida = sc.nextLine();
        palavras.removeIf(itens -> itens.contains(letraEscolhida));
        System.out.println(palavras);

    }
}
