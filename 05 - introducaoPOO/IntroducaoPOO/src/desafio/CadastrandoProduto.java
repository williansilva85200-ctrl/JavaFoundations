package desafio;

import java.util.Scanner;

public class CadastrandoProduto {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroProduto cadastrando = new CadastroProduto();

        System.out.println("Digite o nome do produto");
        cadastrando.nome = sc.nextLine();

        System.out.println("Digite o preço do produto");
        cadastrando.preco = sc.nextDouble();

        System.out.println("Digite a quantidade");
        cadastrando.quantidade = sc.nextInt();

        System.out.println("O nome do produto é " + cadastrando.nome);
        System.out.println("O seu preço é " + cadastrando.preco);
        System.out.println("A quantidade é " + cadastrando.quantidade);
        System.out.println("O preço final é " + cadastrando.calcularTotal());

    }
}
