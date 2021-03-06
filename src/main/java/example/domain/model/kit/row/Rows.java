package example.domain.model.kit.row;

import example.domain.model.kit.row.validation.AddRow;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * すべての列
 */
public class Rows {
    @NotNull(message = "必須")
    @Size(min = 1, message = "少なくとも１列が必要")
    @Size(max = 3 - 1 , message = "多くて3列まで", groups = {AddRow.class})
    // addRowの要求時点で、(3-1)列までであれば追加可能。3列であれば追加できない

    List<@Valid Row> list = new ArrayList<>();

    private Rows(List<Row> list) {
        this.list = list;
    }
    public Rows() {}

    public List<Row> asList() {
        return list;
    }

    public Rows addRow() {
        List<Row> result = new ArrayList<>(list);
        result.add(new Row());

        return new Rows(result);
    }

    public Rows removeRow(int index) {
        List<Row> result = new ArrayList<>(list);
        result.remove(index);

        return new Rows(result);
    }

    @Override
    public String toString() {
        return "Rows{" +
                "list=" + list +
                '}';
    }
}
