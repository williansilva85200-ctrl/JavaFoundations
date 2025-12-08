package desafio;

import java.util.Scanner;

public class MainRoupa {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DesafioRoupa roupa = new DesafioRoupa();

        System.out.println("Qual é a marca da roupa");
        roupa.marca = sc.nextLine();
        System.out.println("Qual é o tipo (camisa, calça ou outra)");
        roupa.tipo = sc.nextLine();
        System.out.println("Qual é o tamanho");
        roupa.tamanho = sc.nextLine();
        System.out.println("Qual é a quantidade");
        roupa.quantidade = sc.nextInt();
        System.out.println("Qual é o preço?");
        roupa.valor = sc.nextDouble();

        System.out.println(roupa.toString());

        System.out.println("Digite quantas camisas voce deseja adicionar ao estoque ");
        int unidades = sc.nextInt();
        roupa.incrementandoEstoque(unidades);

        System.out.println("Aumentou o seu estoque, agora o seu estoque possui " + roupa.quantidade + "roupas") ;

        System.out.println("Digite a quantidade de roupa  de que voce quer tirar do estoque?");
        unidades = sc.nextInt();
        roupa.tirandoDoEstoque(unidades);
        System.out.println("Voce possui no estoque " + roupa.quantidade + " roupas");
    }
}
