package example.domain.model.kit.row;

import javax.validation.Valid;

/**
 * ハーブの品種
 */
public class Variety {
    VarietyNumber varietyNumber = VarietyNumber.numbering();

    @Valid
    VarietyName varietyName;

    private Variety(VarietyName varietyName) {
        this.varietyName = varietyName;
    }

    public Variety() {}

    public String show() {
        return String.format("%s [%s]", varietyName, varietyNumber);
    }

    public VarietyNumber number() {
        return varietyNumber;
    }

    @Override
    public String toString() {
        return "Variety{" +
                "varietyNumber=" + varietyNumber +
                ", name='" + varietyName + '\'' +
                '}';
    }

    public static Variety from(VarietyName varietyName) {
        return new Variety(varietyName);
    }
}
