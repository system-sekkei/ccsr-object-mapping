package example.domain.model.kit.row;

import example.domain.type.Identity;

/**
 * ハーブの品種番号
 */
public class VarietyNumber {
    String value;

    VarietyNumber(String value) {
        this.value = value;
    }

    public VarietyNumber() {}

    @Override
    public String toString() {
        return value;
    }

    static String format = "SP-%s";
    public static VarietyNumber numbering() {
        String result = new Identity(format).generate();
        return new VarietyNumber(result);
    }
}
