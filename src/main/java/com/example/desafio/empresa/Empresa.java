package com.example.desafio.empresa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "empresas")
@Entity(name = "empresas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Empresa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpj;
    private String nomefantasia;
    private String cep;

    public Empresa(EmpresaRequestDTO data){
        this.nomefantasia = data.nomefantasia();
        this.cep = data.cep();
        this.cnpj = data.cnpj();
    }

}
