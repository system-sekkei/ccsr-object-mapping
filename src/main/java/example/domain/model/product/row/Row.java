package example.domain.model.product.row;

/**
 * 列
 */
public class Row {
    Variety variety;
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
