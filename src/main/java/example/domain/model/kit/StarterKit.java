package example.domain.model.kit;

import example.domain.identity.KitNumber;
import example.domain.model.kit.feature.Features;
import example.domain.model.kit.row.Row;
import example.domain.model.kit.row.Rows;
import example.domain.type.Covered;
import example.domain.type.Type;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * ハーブ栽培キット
 */
public class StarterKit {
    KitNumber kitNumber = KitNumber.numbering();
    @Valid
    DateOfSeed dateOfSeed = DateOfSeed.today();
    Covered covered = Covered.無;
    @NotNull(message = "必須")
    Type type = Type.プラスチック;

    @NotNull
    Features features;
    @Valid
    Rows rows = new Rows();

    private StarterKit(KitNumber kitNumber, DateOfSeed dateOfSeed, Covered covered,
                       Type type, Features features, Rows rows) {
        this.kitNumber = kitNumber;
        this.dateOfSeed = dateOfSeed;
        this.covered = covered;
        this.type = type;
        this.features = features;
        this.rows = rows;
    }

    public StarterKit() {}

    public KitNumber kitNumber() {
        return kitNumber;
    }

    public String dateOfSeed() {
        return dateOfSeed.when();
    }

    public Covered covered() {
        return covered;
    }

    public boolean hasCover() { // isCovered() は　coveredフィールドへのアクセサとして動作してしまうため名前を変更
        return covered.isCovered();
    }

    public Type type() {
        return type;
    }

    public String features() {
        return features.show();
    }

    public boolean hasFeatures() {
        return features.hasFeatures();
    }

    public List<Row> rows() {
        return rows.asList();
    }

    public StarterKit addRow() {
        Rows result = rows.addRow();
        return withRows(result);
    }

    public StarterKit removeRow(int index) {
        Rows result = rows.removeRow(index);
        return withRows(result);
    }

    private StarterKit withRows(Rows rows) {
        return new StarterKit(this.kitNumber, this.dateOfSeed, this.covered, this.type, this.features, rows);
    }

    @Override
    public String toString() {
        return "StarterKit{" +
                "kitNumber=" + kitNumber +
                ", dateOfSeed=" + dateOfSeed +
                ", covered=" + covered +
                ", type=" + type +
                ", features=" + features +
                ", rows=" + rows +
                '}';
    }
}
