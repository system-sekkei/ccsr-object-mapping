package example.domain.identity;

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
        return new VarietyNumber(IdentityGenerator.generate(format));
    }
}
