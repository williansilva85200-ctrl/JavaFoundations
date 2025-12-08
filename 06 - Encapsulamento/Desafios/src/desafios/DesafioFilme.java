package desafios;

import entidades.DesafioFilmeEntidade;

public class DesafioFilme {
    static void main(String[] args) {
        DesafioFilmeEntidade filmeEscolhido = new DesafioFilmeEntidade("Chapolin Colorado", "Ação", 120);

        filmeEscolhido.setTitulo("Poeira em alto mar");
        filmeEscolhido.setGenero("Drama");
        filmeEscolhido.setDuracao(200);

        System.out.println("O titulo do filme é " + filmeEscolhido.getTitulo());
        System.out.println("O genero do filme é " + filmeEscolhido.getGenero());
        System.out.println("O duracao do filme é " + filmeEscolhido.getDuracao() + " minutos");




    }
}
