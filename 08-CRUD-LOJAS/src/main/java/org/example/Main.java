package org.example;

import org.example.entidades.GerenciarLoja;
import org.example.entidades.Roupa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciarLoja gerenciarLoja = new GerenciarLoja();
        Roupa roupa1 = new Roupa("Nike", "Camisa", "M", 3, 150);

        gerenciarLoja.cadastrarRoupa(roupa1);
        gerenciarLoja.excluirRoupa(2);
        gerenciarLoja.alterarRoupa(3, "Puma", "Casaco", "GG", 1, 300);
        gerenciarLoja.listarRoupas();
        gerenciarLoja.

        //gerenciarAlunos.listarALunos();

    }

}
