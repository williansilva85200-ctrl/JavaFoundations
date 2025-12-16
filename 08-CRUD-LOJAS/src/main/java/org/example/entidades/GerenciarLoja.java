package org.example.entidades;

import java.sql.*;

public class GerenciarLoja {

    private final String url = "jdbc:mysql://localhost:3306/escola";
    private final String usuario = "root";
    private final String senha = "admin";

    //Metodo para conectar no banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    // Cadastrar Aluno
    public void cadastrarRoupa(Roupa roupa) {

        String sql = "INSERT INTO loja2 (marca, tipo, tamanho, quantidade, valor) " +
                "VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, roupa.getMarca());
            stmt.setString(2, roupa.getTipo());
            stmt.setString(3, roupa.getTamanho());
            stmt.setInt(4, roupa.getQuantidade());
            stmt.setDouble(5, roupa.getValor());

            stmt.executeUpdate();

            System.out.println("Roupa cadastrada com sucesso!");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void excluirRoupa(int id) {
        String sql = "DELETE FROM loja2 WHERE id = ?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("roupa excluida com sucesso!");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void alterarRoupa(int id, String marca, String tipo, String tamanho, int quantidade, double valor) {

        String sql = "UPDATE loja2 " +
                "set marca = ?, tipo = ?, tamanho = ?, quantidade = ?, valor = ? where id = ?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, tipo);
            stmt.setString(3, tamanho);
            stmt.setInt(4, quantidade);
            stmt.setDouble(5, valor);
            stmt.setInt(6, id);
            stmt.executeUpdate();

            System.out.println("Aluno alterado com sucesso");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarRoupas() {
        String sql = "SELECT * FROM loja2";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                        " | " + rs.getInt("id") + " | " +
                                rs.getString("marca") + " | " +
                                rs.getString("tipo") + " | " +
                                rs.getString("tamanho") + " |" +
                                rs.getInt("quantidade") + " | " +
                                rs.getDouble("valor") + " | "
                                rs.getDouble(calcularMedia()));

            }
            ;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    private double calcularMedia(int quantidade, double valor){
        return quantidade * valor;
    }

}

