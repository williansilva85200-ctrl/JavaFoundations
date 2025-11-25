package variaveis;

import java.util.Scanner;

public class Matematica {
    public static void main(String[] args){
         //Potencia
        int base = 2;
        int exponte = 3;
        double potencia = Math.pow(base, exponte);
        System.out.printf("Potencia = %.2f", potencia);
        //Raiz Quadrada
        double numero = 16;
        double raizQuadrado = Math.sqrt(numero);
        System.out.printf("\nRaiz Quadrada = %.2f", raizQuadrado);
        // random - Gerar valores aleatórios

        double aleatorio = Math.random();
        //outra opcao int aleatorio = (int) (Math.random() * 10);
        System.out.printf("\n%.0f", aleatorio * 10);

        // PI
        double pi = Math.PI;
        System.out.println("\npi vale " + pi);



    }
}
