package com.example.lojaroupa.controller;

import org.springframework.web.bind.annotation.*;

// Controller - Responsável por receber as requisicoes em HTTP
// Rest - API Rest

// Funcionamento da API Rest - ela usa métodos HTTP para definir acoes
// Metodo GET - Busca dados
// Metedo POST - Criar Dados
// metodo PUT - Atualizar Dados
// Metodo DELETE - Remover Dados

@RestController
// define a URL do Controller
// Nosso Controller terá o seguinte endpoint
// http://localhost:8080/roupas
@RequestMapping("/roupas")
//Liberar o Acesso
@CrossOrigin(origins = "*")
public class ControllerRoupa {
    //Registar uma roupa no banco

    @PostMapping
    public void cadastrarRoupa(@RequestBody String roupa){
        System.out.println(roupa);
    }

}
