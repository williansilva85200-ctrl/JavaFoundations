package variaveis;

import java.util.Scanner;
//Crie duas variaveis uma para armazenar a cidade aonde a pessoa mora e outra para armazenar o estado
public class EntradaFixacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiramente o nome da sua cidade e depois diga em qual estado é localizada"); //
        String cidade = sc.nextLine();
        String estado = sc.nextLine();
        System.out.println("O nome da sua cidade é "+ cidade + " e é localizada no estado de " + estado);
        // \n quebra a linha

        System.out.println("Digite agora a população da cidade");
        int populacao = sc.nextInt();
        System.out.println("E qual é o tamanho dela? Em hectáres");
        double tamanho = sc.nextDouble();
        System.out.println("O nome da sua cidade é "+ cidade + " e é localizada no estado de " + estado + ", a sua população é de " + populacao + " pessoas, com um tamanho de " + tamanho + " hectáres");
        sc.close();
    }
}
