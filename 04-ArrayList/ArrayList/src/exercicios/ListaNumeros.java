package exercicios;

import java.util.ArrayList;

public class ListaNumeros {
    static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(5);
        numeros.add(8);

        for (Integer numero : numeros){
            System.out.println(numero);
        }
    }
}
