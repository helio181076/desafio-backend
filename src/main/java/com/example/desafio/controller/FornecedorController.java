package com.example.desafio.controller;

import com.example.desafio.fornecedor.Fornecedor;
import com.example.desafio.fornecedor.FornecedorRepository;
import com.example.desafio.fornecedor.FornecedorRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFornecedor(@RequestBody FornecedorRequestDTO data){
        Fornecedor fornecedorData = new Fornecedor(data);
        repository.save(fornecedorData);
        return;

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FornecedorResponseDTO> getAll(){

        List<FornecedorResponseDTO> fornecedorList = repository.findAll().stream().map(FornecedorResponseDTO::new).toList();
        return fornecedorList;


    }
}
