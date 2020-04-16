package example.domain.model.product.row;

import java.util.List;

/**
 * すべての列
 */
public class Rows {
    List<Row> list;

    public List<Row> asList() {
        return list;
    }

    @Override
    public String toString() {
        return "Rows{" +
                "list=" + list +
                '}';
    }
}
