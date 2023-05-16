package com.example.desafio.controller;

import com.example.desafio.empresa.Empresa;
import com.example.desafio.empresa.EmpresaRepository;
import com.example.desafio.empresa.EmpresaRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("empresa")
public class EmpresaController {

    @Autowired
    private EmpresaRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveEmpresa(@RequestBody EmpresaRequestDTO data){
        Empresa empresaData = new Empresa(data);
        repository.save(empresaData);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<EmpresaResponseDTO> getAll(){

        List<EmpresaResponseDTO> empresaList = repository.findAll().stream().map(EmpresaResponseDTO::new).toList();
        return empresaList;


    }
}
