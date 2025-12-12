package org.example;

import org.example.entidades.GerenciarAlunos;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        GerenciarAlunos alunos = new GerenciarAlunos();

        try {
            alunos.conectar();
            System.out.println("Conectado com succeso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
