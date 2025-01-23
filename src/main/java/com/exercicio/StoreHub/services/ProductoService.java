package com.exercicio.StoreHub.services;

import com.exercicio.StoreHub.models.ProductModel;
import com.exercicio.StoreHub.reposittories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getAllProductos() {
        return productRepository.findAll();
    }

    

}
