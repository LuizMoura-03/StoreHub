package com.exercicio.StoreHub.services;

import com.exercicio.StoreHub.models.ProductModel;
import com.exercicio.StoreHub.reposittories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<ProductModel> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<ProductModel> createProduct(List<ProductModel> productModels) {
        return productRepository.saveAll(productModels);
    }

    public ProductModel updateProduct(Long id, ProductModel updateProduct) {
        return productRepository.findById(id).map(product -> {
            product.setName(updateProduct.getName());
            product.setDescricao(updateProduct.getDescricao());
            product.setPreco(updateProduct.getPreco());
            product.setEstoque(updateProduct.getEstoque());
            product.setCategoria(updateProduct.getCategoria());
            return productRepository.save(product);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado");
        }
        productRepository.deleteById(id);
    }

}
