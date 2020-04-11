package example.application.repository;

import example.domain.identity.ProductNumber;
import example.domain.model.product.Product;
import example.domain.model.product.ProductList;

public interface ProductRepository {
    ProductList listAll();

    Product findBy(ProductNumber productNumber);
}
