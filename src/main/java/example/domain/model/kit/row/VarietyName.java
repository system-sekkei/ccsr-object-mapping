package example.domain.model.kit.row;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 品種名
 */
public class VarietyName {
    @NotNull(message = "必須")
    @Size(min=3, message = "{min}字以上")
    @Size(max=20, message = "{max}字以内")
    String value;

    @Override
    public String toString() {
        return value;
    }
}
