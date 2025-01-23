package com.exercicio.StoreHub.reposittories;

import com.exercicio.StoreHub.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
