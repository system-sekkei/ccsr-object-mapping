package example.domain.model.product;

import example.domain.identity.ProductNumber;

/**
 * 商品を特定する情報
 */
public class Product {
    ProductNumber productNumber;
    String name;

    private Product(ProductNumber productNumber, String name) {
        this.productNumber = productNumber;
        this.name = name;
    }

    public Product() {}

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public Product create(String name) {
        return new Product(ProductNumber.numbering(), name);
    }
}
