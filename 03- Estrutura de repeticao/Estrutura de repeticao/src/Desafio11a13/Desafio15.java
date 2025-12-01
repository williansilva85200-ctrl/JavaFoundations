package Desafio11a13;

import java.util.Scanner;

public class Desafio15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Desafio 3: Média de Números com DO-WHILE
        //
        //Peça ao usuário números até que ele digite 0. Calcule e exiba a média dos números digitados.
        double fazendoMedia = 0;
        double notas = 0;
        double i = -1;
        double media = 0;
        while (true){
            System.out.println("Digite a sua nota[0 para parar]");
            notas = sc.nextDouble();
            i++;
            if (notas == 0){
                media = fazendoMedia / i;
                System.out.println("Sua média foi de " + media);
                break;
            }else {
                 fazendoMedia = notas + fazendoMedia;

            }
        }
    }
}
