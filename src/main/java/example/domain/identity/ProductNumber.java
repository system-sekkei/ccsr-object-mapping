package example.domain.identity;

import example.infrastructure.identity.IdentityGenerator;

/**
 * 商品番号
 */
public class ProductNumber {
    String value;

    private ProductNumber(String value) {
        this.value = value;
    }

    private ProductNumber() {};

    @Override
    public String toString() {
        return value;
    }

    static String format = "PN-%s-%sx";
    public static ProductNumber numbering() {
        return new ProductNumber(IdentityGenerator.generate(format));
    }
}