package example.domain.model.kit.row;

import example.domain.identity.VarietyNumber;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * ハーブの品種
 */
public class Variety {
    @ApiModelProperty(hidden = true)
    VarietyNumber varietyNumber = VarietyNumber.numbering();

    @NotNull(message = "必須")
    @Size(min=3, message = "{min}字以上")
    @Size(max=20, message = "{max}字以内")
    String name = "";

    private Variety(VarietyNumber varietyNumber,String name) {
        this.varietyNumber = varietyNumber;
        this.name = name;
    }

    public Variety() {}

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

    public static Variety create(String name) {
        return new Variety(VarietyNumber.numbering(), name);
    }

}
