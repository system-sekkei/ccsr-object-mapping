package example.domain.model.product.row;

import example.domain.identity.VarietyNumber;

/**
 * 品種
 */
public class Variety {
    VarietyNumber varietyNumber;
    String name;

    @Override
    public String toString() {
        return "Variety{" +
                "varietyNumber=" + varietyNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
