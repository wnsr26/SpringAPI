package nvc.it.spring_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.spring_api.model.Product;
import nvc.it.spring_api.repository.ProductRepository;

@Service
public class ProductService {
     @Autowired
     private ProductRepository productRepository;

     public List<Product> getProducts(){
         return productRepository.findAll();
     }

     public Optional<Product> findById(String id){
         return productRepository.findById(id);
     }
     public List<Product> findByProductsName(String name){
         return productRepository.findByNameContaining(name);
     }
    
}
