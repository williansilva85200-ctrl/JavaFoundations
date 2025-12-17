package com.example.lojaroupa.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

//Informa qual tabela do banco se relaciona a entidade
@Table(name = "roupa")
//Informa que a classe Roupa é uma entidade JPA
//Mapeia a Classe para o Banco
@Entity(name =  "Roupa")
//Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {

    @Id // Informa que o id é a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Informa que o banco gera o valor do id
    private int id;
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double preco;
}
