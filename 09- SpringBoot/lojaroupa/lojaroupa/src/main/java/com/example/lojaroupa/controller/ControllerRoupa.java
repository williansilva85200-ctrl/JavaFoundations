package com.example.lojaroupa.controller;

import com.example.lojaroupa.model.DadosRoupa;
import com.example.lojaroupa.model.Roupa;
import com.example.lojaroupa.model.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    private RoupaRepository roupaRepository;

    //Registrar uma roupa no banco
    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosRoupa dadosRoupa){
        System.out.println(dadosRoupa.toString());
        roupaRepository.save(new Roupa(dadosRoupa));
    }
    @GetMapping
    public List<Roupa> listarRoupa() {
        return roupaRepository();
    }

    private List<Roupa> roupaRepository() {
        return roupaRepository.findAll();
    }


}
