package com.example.desafio.controller;

import com.example.desafio.empresa.Empresa;

public record EmpresaResponseDTO(Long id, String cnpj, String nomefantasia, String cep) {

    public EmpresaResponseDTO(Empresa empresa){
        this(empresa.getId(), empresa.getCnpj(), empresa.getNomefantasia(), empresa.getCep());
    }
}
