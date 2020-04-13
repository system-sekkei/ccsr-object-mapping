package example.domain.identity;

import example.infrastructure.identity.IdentityGenerator;

/**
 * 商品番号
 */
public class KitNumber {
    String value;

    private KitNumber(String value) {
        this.value = value;
    }

    private KitNumber() {};

    @Override
    public String toString() {
        return value;
    }

    static String format = "PN-%s-%sx";
    public static KitNumber numbering() {
        return new KitNumber(IdentityGenerator.generate(format));
    }
}