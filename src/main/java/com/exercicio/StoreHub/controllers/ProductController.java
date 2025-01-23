package com.exercicio.StoreHub.controllers;

import com.exercicio.StoreHub.models.ProductModel;
import com.exercicio.StoreHub.services.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<ProductModel> getAllProducts() {
        return productoService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable Long id) {
        return productoService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProductModel> creatProduct(@Valid @RequestBody ProductModel productModel) {
        return ResponseEntity.ok(productoService.creatProduct(productModel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductModel> updateProduct(@PathVariable Long id, @Valid @RequestBody ProductModel updateProdcut) {
        try {
            return ResponseEntity.ok(productoService.updateProduct(id, updateProdcut));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        try {
            productoService.deleteProduct(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
