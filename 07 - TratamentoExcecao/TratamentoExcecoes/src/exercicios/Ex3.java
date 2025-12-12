package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a posicao de um valor na matriz");

        try {
            int posicao = sc.nextInt();
            System.out.println("O nomero escolhido é "+ numeros[posicao]);
        } catch (InputMismatchException e){
            System.out.println("ERRO, informe um número");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
