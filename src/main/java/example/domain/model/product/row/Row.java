package example.domain.model.product.row;

/**
 * 列
 */
public class Row {
    Variety variety;
    int seedsPerCell;

    @Override
    public String toString() {
        return "Row{" +
                "variety=" + variety +
                ", seedsPerCell=" + seedsPerCell +
                '}';
    }
}
