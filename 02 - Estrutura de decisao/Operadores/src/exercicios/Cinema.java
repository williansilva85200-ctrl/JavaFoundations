package exercicios;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a tua idade?????");
        byte idade = sc.nextByte();
        sc.nextLine();

        System.out.print("Voce é um estudante [S/N)");
        String estudante = sc.nextLine();

        System.out.println("Voce é um Professor [S/N]");
        String professor = sc.nextLine();

        if (idade <=12 || idade >= 65){
            System.out.println("Voce está em uma faixa de idade que tem entrada gratuita");
        } else if (estudante.equals("S") || professor.equals("S")){
            System.out.println("Entrada Gratuita");
        } else {
            System.out.println("Nao tem nada de graça para tu");
        }





        sc.close();
    }
}
