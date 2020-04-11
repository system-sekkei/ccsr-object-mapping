package example.infrastructure.datasource.product;

import example.application._sample.ActionRepository;
import example.application.repository.ProductRepository;
import example.domain.identity.ProductNumber;
import example.domain.model._sample.Action;
import example.domain.model._sample.Actions;
import example.domain.model.product.Product;
import example.domain.model.product.ProductList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class ProductDatasource implements ProductRepository {

    ProductMapper productMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public ProductDatasource(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public ProductList listAll() {
        List<Product> result = productMapper.listAll();
        if (result == null) return ProductList.empty();
        return ProductList.from(result);
    }

    @Override
    public Product findBy(ProductNumber productNumber) {
        return productMapper.findBy(productNumber);
    }
}
