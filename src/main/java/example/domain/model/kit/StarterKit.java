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

    private StarterKit(KitNumber kitNumber) {
        this.kitNumber = kitNumber;
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

    public void addRow() {
        rows.addRow();
    }

    public void removeRow(int index) {
        rows.removeRow(index);
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
