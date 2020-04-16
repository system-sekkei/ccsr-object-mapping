package example.domain.model.product.row;

import example.domain.identity.VarietyNumber;

/**
 * 品種
 */
public class Variety {
    VarietyNumber varietyNumber;
    String name;

    public String show() {
        return String.format("%s(%s)", name, varietyNumber);
    }

    @Override
    public String toString() {
        return "Variety{" +
                "varietyNumber=" + varietyNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
