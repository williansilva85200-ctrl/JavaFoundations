package exercicio;

public class Livro {
    String titulo;
    String autor;
    String editora;
    double precoUnitario;
    int quantidade;

    public Livro(String titulo, String autor, String editora, double precoUnitario, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public void alugaLivro(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade){

        System.out.println("Valor inválido");
    }   else{
        this.quantidade -= quantidade;
            System.out.println("Livro alugado com sucesso");
            System.out.println("Livro" + this.titulo + " - " + this.quantidade + "exemplares" );
    }}

    public void devolverLivro(int quantidade) {
        if (quantidade > 0){
            this.quantidade += quantidade;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public double valorTotal() {
        return this.quantidade * this.quantidade;
    }




    public String toString(){
        return "Livro " + this.titulo +
                "\nAutor " + this.autor +
                "\nEditora " + this.editora +
                "\nQuantidade " + this.quantidade +
                "\nValor do Livro " + this.precoUnitario +
                "\nValor final " + this.valorTotal();
    }
}
