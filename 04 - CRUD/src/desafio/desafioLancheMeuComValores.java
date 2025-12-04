package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class desafioLancheMeuComValores {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lanches = new ArrayList<>();
        int i = -1;
        while (true){
            System.out.println("Você possui 5 opções, \n1 - Fazer pedido\n" + "\n" + "2 - Listar pedidos\n" + "\n" + "3 - Atualizar pedido\n" + "\n" + "4 - Cancelar pedido\n" + "\n" + "5 - Sair");
            int opcaoEscolhida = sc.nextInt();
            sc.nextLine();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Você possui 4 opção de carpapio, \n1 - Para X-SALADA (18 REAIS)\n2 - Para X-BURGUER(15 REAIS\n3 - Para X-BACON(18 REAIS)\n4 ");
                    break;
                case 2:
                    for (String indice : lanches){
                        i++;
                        System.out.printf("O lanche %s com o indice %d\n", indice, i);

                    }
                    break;

                case 3:
                    System.out.println("Informe o id do lanche que você gostaria de mudar ");
                    int lancheMudado = sc.nextInt();
                    System.out.println("Qual lanche você gostaria de colocar");
                    sc.nextLine();
                    String lancheNovo = sc.nextLine();
                    lanches.set(lancheMudado, lancheNovo);
                    i = -1;
                    break;
                case 4:
                    System.out.println("Informe o id do lanche que você gostaria de mudar ");
                    int lancheRemovido = sc.nextInt();
                    lanches.remove(lancheRemovido);
                    i = -1;
                    break;
                case 5:
                    System.out.println("Pedido Finalizado");
                    return;
            }

        }
    }
}
