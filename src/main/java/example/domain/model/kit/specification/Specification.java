package example.domain.model.kit.specification;

import example.domain.model.kit.feature.Features;
import example.domain.model.kit.row.Row;
import example.domain.model.kit.row.Rows;
import example.domain.type.Covered;
import example.domain.type.Type;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * キットの仕様
 */
public class Specification {
    @Valid
    DateOfSeed dateOfSeed = DateOfSeed.today();
    Covered covered = Covered.無;

    @NotNull(message = "必須")
    Type type = Type.プラスチック;

    @NotNull
    Features features;
    @Valid
    Rows rows = new Rows();

    private Specification(DateOfSeed dateOfSeed, Covered covered, Type type, Features features, Rows rows) {
        this.dateOfSeed = dateOfSeed;
        this.covered = covered;
        this.type = type;
        this.features = features;
        this.rows = rows;
    }

    private Specification() {}

    public Type type() {
        return type;
    }

    public Covered covered() {
        return covered;
    }

    public String when() {
        return dateOfSeed.when();
    }

    public boolean hasCover() {
        return covered.isCovered();
    }

    public Features features() {
        return features;
    }

    public boolean hasFeatures() {
        return features.hasFeatures();
    }

    public List<Row> rows() {
        return rows.asList();
    }

    public Specification addRow() {
        Rows result = rows.addRow();
        return withRows(result);
    }

    public Specification removeRow(int index) {
        Rows result = rows.removeRow(index);
        return withRows(result);
    }

    private Specification withRows(Rows rows) {
        return new Specification(this.dateOfSeed, this.covered, this.type, this.features, rows);
    }

    @Override
    public String toString() {
        return "Specification{" +
                "dateOfSeed=" + dateOfSeed +
                ", covered=" + covered +
                ", type=" + type +
                ", features=" + features +
                ", rows=" + rows +
                '}';
    }
}
