package entidades;

public class DesafioFilmeEntidade {

    //Crie uma classe chamada Filme com os atributos privados:
    //
    //titulo (String)
    //
    //genero (String)
    //
    //duracao (int) — em minutos
    //
    //Regras dos setters
    //
    //O título não pode ser vazio.
    //
    //O gênero não pode ser vazio.
    //
    //A duração deve ser maior que 0.

    private String titulo;
    private String genero;
    private int duracao;

    public DesafioFilmeEntidade(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = 0;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    //setters

    public void setTitulo(String titulo){
        if (titulo == null || titulo.trim().isEmpty()){
            System.out.println("Titulo Inválido");
        }else {
            this.titulo = titulo;
        }
    }

    public void setGenero(String genero){
        if (genero == null || titulo.trim().isEmpty()){
            System.out.println("Genero Inválido");
        }else {
            this.genero = genero;
        }
    }

    public void setDuracao(int duracao) {
        if (duracao < 0){
            System.out.println("Não existe filme ou ");
        }else {
            this.duracao = duracao;
        }
    }
}
