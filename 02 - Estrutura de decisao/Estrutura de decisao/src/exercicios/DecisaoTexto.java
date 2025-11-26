package exercicios;

import java.util.Scanner;

public class DecisaoTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //É usado o equals() para comparar igualdade em valores do tipo string


        System.out.println("Voce está gravida [S/N]");
        String resposta = sc.nextLine();

        if (resposta.equals("S") ){
            System.out.println("Nao vai pagar o trem");
        } else {
            System.out.println("Vai pagar o trem");
        }


        sc.close();

    }
}
