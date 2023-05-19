package com.example.desafio.fornecedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "fornecedores")
@Entity(name = "fornecedores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Fornecedor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpjcpf;
    private String nome;
    private String email;
    private String cep;

    public Fornecedor(FornecedorRequestDTO data){
        this.nome = data.nome();
        this.email = data.email();
        this.cep = data.cep();
        this.cnpjcpf = data.cnpjcpf();
    }

}
