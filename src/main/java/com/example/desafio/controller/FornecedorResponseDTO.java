package com.example.desafio.controller;

import com.example.desafio.fornecedor.Fornecedor;

public record FornecedorResponseDTO(Long id, String cnpjcpf, String nome, String email, String cep) {

    public FornecedorResponseDTO(Fornecedor fornecedor){
        this(fornecedor.getId(), fornecedor.getCnpjcpf(), fornecedor.getNome(), fornecedor.getEmail(), fornecedor.getCep());
    }
}
