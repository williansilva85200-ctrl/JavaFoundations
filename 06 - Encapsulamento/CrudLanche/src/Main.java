import entidades.Lanche;
import entidades.ListaPedido;
import entidades.MenuLanches;
import entidades.Pedido;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches menu = new MenuLanches();
        ListaPedido listaPedido = new ListaPedido();


        int opcao;

        while (true){
            System.out.println("---- MENU DE OPÇÕES");
            System.out.println("1 - CADASTRAR LANCHE");
            System.out.println("2 - LISTAR PEDIDO");
            System.out.println("3 - ALTERAR PEDIDO");
            System.out.println("4 - EXCLUIR PEDIDO");
            System.out.println("5 - CALCULAR PEDIDO");
            System.out.println("6 - SAIR DO PROGRAMA");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = sc.nextInt();

            switch (opcao){

                case 1 -> {
                    menu.exibirCardapio();
                    System.out.println("Digite a opção desejada");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();
                    var lancheEscolhido = menu.getCardapio(opcaoLanche);
                    System.out.println("Digite a quantidade desejada");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(lancheEscolhido.getNome(),
                            quantidade,
                            lancheEscolhido.getPrecoUnitario());
                    listaPedido.adicionarPedido(pedido);
                }
                case 2 -> {
                    listaPedido.listarPedido();
                }
                case 3 -> {
                    listaPedido.listarPedido();
                    System.out.println("Digite o id de qual pedido você deseja trocar");
                    int idLanchePedido = sc.nextInt();

                    menu.exibirCardapio();
                    System.out.println("Qual é o id do lanche que deseja colocar no pedido?");
                    int idLancheCardapio = sc.nextInt();
                    sc.nextLine();

                    var novoLanche =menu.getCardapio(idLancheCardapio);

                    System.out.println("Digite a quantidade desejada");
                    int novaQuantidade = sc.nextInt();
                    sc.nextLine();

                    listaPedido.trocarPedido(idLanchePedido, novoLanche.getNome(), novaQuantidade, novoLanche.getPrecoUnitario());




                }
                case 4 -> {
                    listaPedido.listarPedido();
                    System.out.println("Informe o id do lanche que deseja remover: ");
                    int idLanchePedido = sc.nextInt();
                    sc.nextLine();
                    listaPedido.removerPedido(idLanchePedido);
                }
                case 5 -> {
                    System.out.println("O valor total foi R$ " + listaPedido.calcularValorTotal());

                }

                case 6 -> {
                    System.out.println("Programa finalizado");
                    return;
                }
            }

        }

    }
}