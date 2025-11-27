package desafios6a10;

import java.util.Scanner;

public class Desafios6a10 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Crie um programa que leia a nota de um aluno e mostre uma mensagem detalhada:
        //
        //Nota abaixo de 5: "Reprovado - precisa melhorar muito".
        //
        //Nota entre 5 e 6.9: "Recuperação - dedicação é necessária".
        //
        //Nota entre 7 e 8.9: "Aprovado - desempenho satisfatório".
        //
        //Nota 9 ou mais: "Aprovado com Distinção - excelente!".
        //
        //Não utilizar operadores lógicos
        System.out.println("Me diga a nota que voce tirou");
        double nota = sc.nextDouble();

        if (nota < 5){
            System.out.println("Repetiu de ano irmao");

        }else if (nota < 7){
            System.out.println("Recuperação, vamos ficar junto até o natal");

        }else if (nota < 9){
            System.out.println("Aprovado, mas confia que voce conseguiria mais");

        }else{
            System.out.println("Aprovado com folga, tu é gênio man");
        }


        //Desafio 2: Calculadora de Multa por Excesso de Velocidade
        //
        //Crie um programa que calcule o valor da multa a ser paga caso um motorista ultrapasse o limite de velocidade. O limite de
        //velocidade será de 90 km/h e o usuário deve inserir a velocidade do veículo. Para cada quilômetro por hora acima do limite,
        //será cobrado R$ 10,00.

        System.out.println("Qual foi a velocidade que o seu fusca passou? Em Km/h");
        double velocidade = sc.nextDouble();
        if (velocidade >=90){
            velocidade = (velocidade - 90) * 10;  //fiz isso para nao criar uma nova variável
            System.out.println("ta ferrado vai ter que pagar " + velocidade + " de multa pro governo");
        }else {
            System.out.println("Está de boa, mas tem que acelerar mais eese fusca");
        }

        //Desafio 3: Adivinhe o Número
        //
        //Crie um programa em Java que simula um jogo de adivinhação. A máquina irá gerar um número inteiro aleatório entre 1 e 10
        //(inclusive). O jogador terá uma tentativa para adivinhar o número. O programa deverá exibir mensagens indicando se o jogador
        //acertou ou errou.

        int numeroSorteado = (int) (Math.random() * 10) + 1; //para saber se está tudo certo
        System.out.println("numero do bot" + numeroSorteado);

        System.out.println("Vamos jogar um jogo, digite um número de 1 a 10, se voce acertar eu pulo na piscina");

        int numeroEscolhido = sc.nextInt();

        if (numeroSorteado == numeroEscolhido){
            System.out.println("Parabens, olhando o meu número é facil");

        }else {
            System.out.println("Tu é ruim dms man, olhando voce errou");
        }
        //DESAFIO 4
        //Desenvolva um programa que peça ao usuário um valor em reais e a moeda para a qual deseja converter:
        //
        //1 - Dólar (R$ 1 = US$ 0.20).
        //
        //2 - Euro (R$ 1 = € 0.18).
        //
        //3 - Libra (R$ 1 = £ 0.15).
        //
        //Use switch para calcular e mostrar o valor convertido.

        System.out.println("Quantos reais você tem e depois digite 1 para converter para dolar, 2 para euro e 3 para libra");
        double reais = sc.nextDouble();
        double escolha = sc.nextDouble();

        double dolar = reais * 0.20;
        double euro = reais * 0.18;
        double libra = reais * 0.15;

        if (escolha == 1){
            System.out.printf("Voce possui %.2f reais e equivale em dolar %.2f US$", reais, dolar);
        }else if (escolha == 2){
            System.out.printf("Voce possui %.2f reais e equivale em euros %.2f €", reais, euro);
        }else {
            System.out.printf("Voce possui %.2f reais e equivale em dolar %.2f £", reais, libra);
        }

        //DESAFIO 4 COM SWITCH

        System.out.println("\nInforme quantos reais voce possui: ");
        double reais2 = sc.nextDouble();

        System.out.println("Informe qual moeda voce deseja converter");
        System.out.println("1 - Dolar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        System.out.println("A moeda escolhida foi: ");
        int opcao2 = sc.nextInt();

        switch (opcao2){
            case 1:
                double dolar2 = reais2 * 0.20;
                System.out.println("O valor em dolar é " + dolar2);
                break;
            case 2:
                double euro2 = reais * 0.18;
                System.out.println("O valor em euro é "+ euro2);
                break;
            case 3:
                double libra2 = reais2 * 0.15;
                System.out.println("O valor em libra é "+ libra2);
                break;
            default:
                System.out.println("opcao inválida");
                break;


        }




        ////Desafio 5: Cálculo de Taxa de Empréstimo
        //        //
        //        //Elabore um programa que peça ao usuário para informar o valor de um empréstimo e o número de parcelas desejadas (6, 12 ou
        //        //24 meses). Use uma estrutura switch para calcular o valor final, considerando as taxas:

        System.out.println("\nDiga-me qual é o valor o que voce quer um empréstimo, voce possui 3 opcões,  6 meses: +5% do valor total, 12 meses: +10%  24 meses: +20% do valor total. A segunda resposta tem que ser em 1, 2 ou 3, ja está na ordem correta");

        double emprestimo = sc.nextDouble();
        double opcao = (sc.nextDouble());

        if (opcao == 1) {
            emprestimo = emprestimo + emprestimo * 0.05;
            System.out.printf("O valor a ser pago é de %.2f", emprestimo);
        }else if (opcao == 2) {
            emprestimo = emprestimo + emprestimo * 0.10;
            System.out.printf("O valor a ser pago é de %.2f", emprestimo);
        }else{
            emprestimo = emprestimo + emprestimo * 0.20;
            System.out.printf("O valor a ser pago é de %.2f", emprestimo);
        }
        //desafio11
        //# Valor gasto pelo usuario.
        //# Metodo de pagamento
        //#   - Dinheiro/Pix = 10% de desconto
        //#   - Debito = 5% de desconto
        //#   - Credito
        //#       - A vista = Valor total
        //#       - 2x = 5% de acrescimo - Valor de cada parcela
        //#       - 3x = 10% de acrescimo - Valor de cada parcela


        System.out.println("\nQuanto ficou a sua compra?");
        double compra = sc.nextDouble();
        System.out.println("Método de pagamento");
        System.out.println("Dinheiro/Pix = 10% de desconto");
        System.out.println("Debito = 5% de desconto");
        System.out.println("Credito");
        int opcao3 = sc.nextInt();

        switch (opcao3){
            case 1:
                compra = compra - compra * 0.10;
                System.out.println("O valor da sua compra com desconto foi: " + compra);
                break;
            case 2:
                compra = compra - compra * 0.05;
                System.out.println("O valor da sua compra com desconto foi: " + compra);
                break;
            case 3:
                System.out.println("No credito, voce possui mais 3 opções, as quais são:");
                System.out.println("Opção 1 - A vista = Valor total");
                System.out.println("Opcão 2 - 2x = 5% de acrescimo - Valor de cada parcela");
                System.out.println("Opção 3 - 3x = 10% de acrescimo - Valor de cada parcela");
                opcao3 = sc.nextInt();
                switch (opcao3){
                    case 1:
                        System.out.println("O valor da sua compra com desconto foi: " + compra);
                        break;
                    case 2:
                        compra = compra * 1.05 / 2;
                        System.out.println("O valor da sua compra teve um acréscimo, por isso o parcelado em 2 vezes é " + compra);
                        break;
                    case 3:
                        compra = compra * 1.10 / 3;
                        System.out.println("O valor da sua compra teve um acréscimo, por isso o valor parcelado em 3 vezes é " + compra);
                        break;
                }
                break;


        }



        sc.close();
    }
}
