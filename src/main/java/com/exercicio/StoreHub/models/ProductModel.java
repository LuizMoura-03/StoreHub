package com.exercicio.StoreHub.models;

import com.exercicio.StoreHub.enums.CategoriaProduto;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatorio")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
    private String name;

    @Size(max = 500, message = "Adescrição não pode ultrapassar os 500 caracteres.")
    private String descricao;

    @NotNull(message = "O preço é obrigatorio")
    @DecimalMin(value = "0.01", message = "O preço deve ser maior que 0 'zero'")
    private Double preco;

    @NotNull(message = "A quantidade en estoque é obirgatorio")
    @Min(value = 0, message = "A quantidade em estoque deve ser maior o igual a 0 'zero'")
    private Integer estoque;

    @NotNull(message = "A categoria é obrigatoria")
    @Enumerated(EnumType.STRING)
    private CategoriaProduto categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
}
