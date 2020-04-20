package example.domain.model.product.row;

import example.domain.identity.VarietyNumber;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 品種
 */
public class Variety {
    VarietyNumber varietyNumber = VarietyNumber.numbering();
    @NotEmpty(message = "必須")
    @Size(min=3, message = "{min}字以上")
    @Size(max=20, message = "{max}字以内")
    String name = "";

    public String show() {
        return String.format("%s [%s]", name, varietyNumber);
    }

    public String number() {
        return varietyNumber.toString();
    }

    @Override
    public String toString() {
        return "Variety{" +
                "varietyNumber=" + varietyNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
