package com.exercicio.StoreHub.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatorio")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
    private String name;

    @Size(max = 500, message = "Adescrição não pode ultrapassar os 500 caracteeres.")
    private String descricao;

    @NotNull(message = "O preço é obrigatorio")
    @DecimalMin(value = "0.01", message = "O preço deve ser maior que 0 'zero'")
    private Double preco;

}
