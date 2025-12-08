package entidades;

public class DesafioCarroEntidade {

    //Crie uma classe chamada Carro com os seguintes atributos privados:
    //
    //modelo (String)
    //
    //ano (int)
    //
    //velocidadeMaxima (double)
    //
    //Regras dos setters
    //
    //O modelo não pode ser vazio.
    //
    //O ano deve ser maior ou igual a 1886 (ano do primeiro carro da história).
    //
    //A velocidade máxima deve ser maior que 0.
    //
    //DESAFIO

    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    public DesafioCarroEntidade(String modelo, int ano, double velocidadeMaxima) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno () {
        return ano;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }



    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()){
            System.out.println("Digite um modelo válido");
        }else {
            this.modelo = modelo;
        }

    }
    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        }else {
            System.out.println("Não existe um carro dessa época");
        }
    }


    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima < 0 ) {
            System.out.println("Velociade inválida");
        }else {
        this.velocidadeMaxima = velocidadeMaxima;
        }
    }



}
