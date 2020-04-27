package example.domain.model.kit.row;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 列
 */
public class Row {
    @NotNull(message = "必須") // @Validは指定しない (名前の必須チェックはStarterKit登録時には不要）
    Variety variety;
    @Min(value = 1, message = "最低1粒")
    @Max(value = 20, message = "最大２０粒")
    int seedsPerCell;

    public String variety() {
        return variety.show();
    }

    public String seedsPerCell() {
        return String.format("%d粒", seedsPerCell);
    }

    @Override
    public String toString() {
        return "Row{" +
                "variety=" + variety +
                ", seedsPerCell=" + seedsPerCell +
                '}';
    }
}
