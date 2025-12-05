package desafio;

public class CadastroProduto {
    String nome;
    double preco;
    int quantidade;

    public double calcularTotal(){
        double precoTotal = preco * quantidade;
        return precoTotal;

    }
}
