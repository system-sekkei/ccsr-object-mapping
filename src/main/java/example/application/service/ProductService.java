package example.application.service;

import example.application.repository.ProductRepository;
import example.domain.identity.ProductNumber;
import example.domain.model.product.Product;
import example.domain.model.product.ProductList;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductList listAll() {
        return productRepository.listAll();
    }

    public Product findBy(ProductNumber productNumber) {
        return productRepository.findBy(productNumber);
    }
}
