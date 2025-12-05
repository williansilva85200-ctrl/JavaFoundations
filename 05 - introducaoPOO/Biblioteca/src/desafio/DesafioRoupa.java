package desafio;

public class DesafioRoupa {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;

    public double calculandoValor(){
        return quantidade * valor;
    }

    public void incrementandoEstoque( int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void tirandoDoEstoque(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade){

            System.out.println("Valor inválido");
        }   else{
            this.quantidade -= quantidade;
            System.out.println("Roupa tirada do estoque com sucesso, agora seu estoque possui " + this.quantidade + "roupas" );
        }}



    public String toString() {
        return "marca " + this.marca +
                "\ntipo " + this.tipo +
                "\ntamanho " + this.tamanho +
                "\nQuantidade " + this.quantidade +
                "\nValor Utilitário " + this.valor +
                "\nValor final " + this.calculandoValor();
    }
}
