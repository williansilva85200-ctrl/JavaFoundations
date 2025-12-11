package entidades;

import java.util.ArrayList;

public class ListaPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    MenuLanches menu = new MenuLanches();
    ListaPedido listaPedido = new ListaPedido();
    //Adicionar Pedido na lista pedidos
    public void adicionarPedido(Pedido pedido) {
        if (pedido.getQuantidade() <= 0){
            System.out.println("Informe um valor maior que zero");
        } else {
            pedidos.add(pedido);
            System.out.println("Pedido realizado com sucesso");
        }

    }
    public void listarPedido() {
        for (int i = 0; i < pedidos.size(); i++){
            System.out.println(" | " + i + pedidos.get(i).toString());
        }
    }

    public void trocarPedido(int id, String nome, int quantidade, double valor) {
        if (quantidade <= 0){
            System.out.println("Informe uma quantiade maior que zero");
        } else {
            var pedidoAlterado = pedidos.get(id);

            pedidoAlterado.setNomeLanche(nome);
            pedidoAlterado.setPreco(valor);
            pedidoAlterado.setQuantidade(quantidade);
            System.out.println("pedido alterado com sucesso");

        }


    }

    public void removerPedido(int id){
        pedidos.remove(id);
        System.out.println("Pedido excluido com sucesso");
    }

    public double calcularValorTotal () {
        double total = 0;

        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }

        return total;
    }
}
