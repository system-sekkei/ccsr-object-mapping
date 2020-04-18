package example.domain.model.product.row;

import java.util.ArrayList;
import java.util.List;

/**
 * すべての列
 */
public class Rows {
    List<Row> list = new ArrayList<>();

    public List<Row> asList() {
        return list;
    }

    public void addRow() {
        list.add(new Row());
    }

    @Override
    public String toString() {
        return "Rows{" +
                "list=" + list +
                '}';
    }
}
