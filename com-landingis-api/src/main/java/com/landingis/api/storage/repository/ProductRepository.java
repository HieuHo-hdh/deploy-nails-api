package com.landingis.api.storage.repository;

import com.landingis.api.storage.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    public List<Product> findByCategoryIdAndStatusOrderByIdAsc(Long categoryId, Integer status);
//    public List<Product> findByCategoryIdAndStatusAndParentProductIdOrderByIdAsc(Long categoryId, Integer status, Long parentId);
}
