import entidades.ContaBancaria;

public class Main {
    static void main(String[] args) {
        ContaBancaria enzo = new ContaBancaria("Enzo", "482.362.688-25");

        System.out.println(enzo.getNome());
        System.out.println(enzo.getCpf());
        System.out.println(enzo.getSaldo());

        enzo.setNome("Enzo Souza");
        System.out.println(enzo.getNome());

        enzo.setCpf("234.431.321-20");
        System.out.println(enzo.getCpf());

        enzo.depositar(1000);
        enzo.sacar(500);
        System.out.println(enzo.getSaldo());

    }
}
