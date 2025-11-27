package Desafios07a10;

import java.util.Scanner;

public class desafios {

    public static void main(String[] args) {
        //Desafio 7: Classificação de Triângulos (Aproveite o Desafio 01)
        //
        //Crie um programa que receba três números, que você já sabe serem lados de um triângulo válido. O programa deve classificar
        //o triângulo nos seguintes tipos:
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A:");
        double a = sc.nextDouble();
        System.out.println("Digite o lado B:");
        double b = sc.nextDouble();
        System.out.println("Digite o lado C:");
        double c = sc.nextDouble();

        boolean ladoAB = a + b > c;
        boolean ladoaC = a + c > b;
        boolean ladoBC = b + c > a;

        if (ladoAB && ladoBC && ladoaC) {
            if (a == b && a == c) {
                System.out.println("Esse é um triangulao equilatero");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Esse é um triangulo isoceles");
            }else {
                System.out.println("É um triângulo escaleno");
            }

        }else {
            System.out.println("Nao é possivel formar um triangulo");



        }
        //Desafio 3: Calculadora de Seguro de Automóveis
        //
        //Peça ao usuário sua idade, sexo e anos de experiência como motorista. Calcule o valor do seguro:
        //
        //Para homens com menos de 25 anos e menos de 2 anos de experiência: R$ 2000.
        //
        //Para mulheres com menos de 25 anos e menos de 2 anos de experiência: R$ 1800.
        //
        //Para motoristas com mais de 25 anos ou mais de 2 anos de experiência: R$ 1200
        //
        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual é o seu genero [M/F}");
        String genero = sc.nextLine();

        System.out.println("Agora é seus anos de experiencia ");
        int anos = sc.nextInt();

        if (idade < 25 && anos < 2){
            if (genero.equals("M")){
                System.out.println("O seu seguro ficou 2000 reais");
            }else {
                System.out.println("O seu seguro ficou 1800 raeis");
            }
        }else{
            System.out.println("O seu seguro ficou 1200 conto");
        }

        //Desafio 4: Sistema de Descontos
        //
        //Peça o valor de uma compra e o número de itens adquiridos. Calcule o desconto:
        //
        //Se o valor total for maior que R$ 300 ou o número de itens maior que 3, aplique 5%.
        //
        //Se o valor total for maior que R$ 500 ou o número de itens maior que 5, aplique 10%.
        //
        //Se o valor total for maior que R$ 1000, aplique 20%.
        //
        //Caso contrário, não aplique desconto. Exiba o valor final com ou sem desconto.


        System.out.println("Peça o valor de uma compra e o número de itens adquiridos. Calcule o desconto:");
        double compra = sc.nextDouble();
        int itens = sc.nextInt();
        double total;
        if (compra >= 1000){
            total = compra * 0.8;
            System.out.printf("O valor sem desconto é %.2f e com desconto de 20%% ficou %.2f ", compra, total);
        }else if (compra > 500 || itens > 5){
            total = compra * 0.9;
            System.out.printf("O valor sem desconto é %.2f e com desconto de 10%% ficou %.2f ", compra, total);
        }else if (compra > 300 || itens > 3){
            total = compra * 0.95;
            System.out.printf("O valor sem desconto é %.2f e com desconto de 5%% ficou %.2f ", compra, total);
        }else {
            System.out.printf("O valor não tem desconto, por isso ficou %.2f", compra);
        }
        //Desafio 5: Validação de Login e Senha
        //
        //Peça ao usuário um login e uma senha. Valide se:
        //
        //O login contém pelo menos 5 caracteres.
        //
        //A senha tem pelo menos 8 caracteres.
        //
        //Exiba uma saída mostrando se o Login e a Senha são validos.
        sc.nextLine();

        System.out.println("\nFaça um login");
        String login = sc.nextLine();
        System.out.println("Manda a senha agr");
        String senha = sc.nextLine();

        if (login.length() >= 5 && senha.length() >= 8){
            System.out.println("A senha e login foram válidos");
        }else {
            System.out.println("A senha e login foram inválidos");
        }





























        sc.close();

    }
}
