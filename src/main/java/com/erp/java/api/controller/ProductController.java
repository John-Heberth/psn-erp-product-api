package com.erp.java.api.controller;

import com.erp.java.api.openapi.ProductControllerOpenApi;
import com.erp.java.domain.entity.ProductEntity;
import com.erp.java.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController implements ProductControllerOpenApi {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(@RequestBody ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public List<ProductEntity> getAllProdutos() {
        return productRepository.findAll();
    }

}
