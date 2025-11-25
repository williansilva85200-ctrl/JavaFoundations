package Desafio;

import java.util.Scanner;

public class Desafios1a5 {

    public static void main(String[] args){
        // Desafio 01 - Conversão de Temperatura
        //
        //Solicite ao usuário uma temperatura em Celsius (tipo double) e converta para Fahrenheit (F) e Kelvin(K). A
        //fórmula é:

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em celsious para ser convertida para Fahrenheit e Kelvin");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5 ) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("A temperatura em Fahrenheit é %.2f e em Kelvin é %.2f", fahrenheit, kelvin);

        //Desafio 02 - Calculando Juros Compostos
        //
        //Implemente um programa que solicite o capital inicial, a taxa de juros (em % ao mês) e o número de meses. Calcule e exiba o
        //montante total com base na fórmula de juros compostos:

        System.out.println("\nDESAFIO 2: Digite qual é o capital inicial, posteriormente a taxa de juros ao mês em decimais e o números de meses, para saber o montante de seu investimento. ");
        double capital = sc.nextDouble();
        double taxaDeJuros = sc.nextDouble();
        double numerosDeMeses = sc.nextDouble();

        double montanteFinal = capital *(Math.pow(1 + taxaDeJuros, numerosDeMeses));
        System.out.printf("O montante final é de %.2f reais", montanteFinal);

        //Desafio 03 – Média de Aluno
        //
        //Faça um programa que leia três notas de um aluno e calcule a média final. Ao final, exiba a média formatada.
        //
        //Exemplo de Saída: “A média final do aluno é 7.0”

        System.out.println("\nQual foi a sua na suas das 3 avaliações ");
        double media1 = sc.nextDouble();
        double media2 = sc.nextDouble();
        double media3 = sc.nextDouble();
        double mediaFinal = (media1 + media2 + media3) / 3;
        System.out.printf("A media final sua foi de %.1f", mediaFinal);

        //Desafio 04 - Calculadora de Juros Simples
        //
        //Crie um programa que leia o capital inicial, a taxa de juros mensal (%) e o tempo (em meses). Calcule os juros simples e
        //mostre os valores dos juros e do montante total ao final do período.
        System.out.println("Me diga qual foi o seu capital inicial, a qual taxa de juros mensal e em quanto meses durou sua aplicacao(Juros Simples)");
        double capital2 = sc.nextDouble();
        double taxaDeJuros2 = sc.nextDouble();
        double numeroDeMeses2 = sc.nextDouble();
        double montanteFinal2 = capital2 + taxaDeJuros2 * capital2 * numeroDeMeses2;
        System.out.println("O seu montante final é de " + montanteFinal2);

        // Desafio 05 – Área e Perímetro de um Círculo
        //
        //Crie um programa que leia o raio de um círculo e calcule:

        System.out.println("Me diga qual é raio do seu circulo e eu te direi qual é o seu comprimento e sua área");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("O perímetro de seu circulo é %.2f e sua área é de %.2f", perimetro, area);
    }
}
