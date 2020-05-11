package example.domain.model.kit;

import example.domain.type.Identity;

/**
 * 栽培キット番号
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
        String result = new Identity(format).generate();
        return new KitNumber(result);
    }
}