package example.domain.model.kit.row;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import example.domain.identity.VarietyNumber;
import example.domain.model.kit.row.validation.VarietyName;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

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
