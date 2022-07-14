package com.educandoweb.webservices.services;

import com.educandoweb.webservices.entities.Product;
import com.educandoweb.webservices.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
            return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }


}
