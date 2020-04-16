package example.domain.identity;

/**
 * 商品番号
 */
public class KitNumber {
    String value;

    private KitNumber(String value) {
        this.value = value;
    }

    public KitNumber() {};

    @Override
    public String toString() {
        return value;
    }

    static String format = "KN-%s-%s";
    public static KitNumber numbering() {
        return new KitNumber(IdentityGenerator.generate(format));
    }
}