package variaveis;

public class VariaveisRegras {
    public static void main(String[] args){
        //iNFORMAR o tipo de valor que será armazenado
        // nome = "Manuel"; nao pode
        String nome = "Manuel";


        // Nao pode atribuir valores inadequados a um tipo de variavel
        // String pessoa = 10; nao pode
        String pessoa = "10"; // Esse pode

        //Nao podemos atribuir o mesmo nome para duas variaveis
        String nome2 = "Diego";

        //Nomes de variáveis não podem começar com números
        // String 3nome = "diego"; nao pode
        String nome3 = "diego";  // pode

        //Convencão
        // Nome Completo
        //camelCase
        String nomeCompleto = "Joao Ricardo";

        //snake-case

        String nome_completo = "Joao roberto";

        System.out.println(nome_completo);

        //NAo podemos usar palavras reservadas como variáveis
        String valor = "Sistema";


    }
}
