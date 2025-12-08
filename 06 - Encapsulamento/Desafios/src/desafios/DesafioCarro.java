package desafios;

import entidades.DesafioCarroEntidade;

public class DesafioCarro {
    static void main(String[] args) {
        DesafioCarroEntidade carroEscolhido = new DesafioCarroEntidade("Ford K", 2004, 150);

        carroEscolhido.setModelo("Mc Lárem");
        carroEscolhido.setAno(2010);
        carroEscolhido.setVelocidadeMaxima(250);

        System.out.println(carroEscolhido.getModelo());
        System.out.println(carroEscolhido.getAno());
        System.out.println(carroEscolhido.getVelocidadeMaxima());
    }
}
