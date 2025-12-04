package desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LancheMenuProfessor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
                "X-Burger",
                "X-Egg",
                "X-Bacon",
                "X-Salada",
                "X-Tudo"
        ));
        ArrayList<Double> menuPrecos = new ArrayList<>(Arrays.asList(
                22.9,
                24.9,
                26.9,
                26.9,
                29.9
        ));

        ArrayList<String> lanches = new ArrayList<>();

        while (true) {
            System.out.println("Você possui 5 opções, \n1 - Fazer pedido\n" + "\n" + "2 - Listar pedidos\n" + "\n" + "3 - Atualizar pedido\n" + "\n" + "4 - Cancelar pedido\n" + "\n" + "5 - Sair");
            int opcaoEscolhida = sc.nextInt();
            sc.nextLine();
            switch (opcaoEscolhida) {
                case 1:
                    for (int i = 0; i < menuLanches.size(); i++) {
                        System.out.println(i + "-" + menuLanches.get(i) + "-" + menuPrecos.get(i));

                    }

                    System.out.println("informe o numero do lanche");
                    int indiceLanche = sc.nextInt();
                    sc.nextLine();

                    String pedidos = menuLanches.get(indiceLanche);

                    double valorLanchePedidos = menuPrecos.get(indiceLanche);
                    sc.nextLine();

                    System.out.println("Pedido feito");
                    break;

                case 2:
                    System.out.println("O pedido é " + pedidos + "e o seu preço é " + valorLanchePedidos);



            }


    }   }
}


