package Desafio11a13;

import java.util.Scanner;

public class Desafio15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Desafio 3: Média de Números com DO-WHILE
        //
        //Peça ao usuário números até que ele digite 0. Calcule e exiba a média dos números digitados.
        int fazendoMedia = 0;
        int notas = 0;
        int i = -1;
        int media = 0;
        while (true){
            System.out.println("Digite a sua nota[0 para parar]");
            notas = sc.nextInt();
            i++;
            if (notas == 0){
                media = fazendoMedia / i;
                System.out.println("Sua nota foi de " + media);
                break;
            }else {
                 fazendoMedia = notas + fazendoMedia;

            }
        }
    }
}
