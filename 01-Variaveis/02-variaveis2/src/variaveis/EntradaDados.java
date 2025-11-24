package variaveis;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Metodo Next - Capturar a palarva digitada pelo usuário
        System.out.println("digite seu nome: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println(nome);

        //Metodo NextLine - Capturar a linha digitada pelo usuário
        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.println(nomeCompleto);

        //Metodo Next int - Capturar números inteiros
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();


        //Metodo NextDouble - Capturar numeros decimais
        System.out.println("Digite a sua altura em m");
        double altura = sc.nextDouble();

        System.out.println("O " + nomeCompleto + " tem " + idade + " anos" + altura + " m");
        sc.close();

    }
}
