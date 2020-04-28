package example.domain.model.kit;

import example.domain.identity.KitNumber;
import example.domain.model.kit.row.Row;
import example.domain.type.Covered;
import example.domain.type.Type;

import javax.validation.Valid;
import java.util.List;

/**
 * ハーブ栽培キット
 */
public class StarterKit {
    KitNumber kitNumber = KitNumber.numbering();

    @Valid
    Specification specification;

    private StarterKit(KitNumber kitNumber, Specification specification) {
        this.kitNumber = kitNumber;
        this.specification = specification;
    }

    public StarterKit() {}

    public KitNumber kitNumber() {
        return kitNumber;
    }

    public String dateOfSeed() {
        return specification.when();
    }

    public Covered covered() {
        return specification.covered;
    }

    public boolean hasCover() { // isCovered() は　coveredフィールドへのアクセサとして動作してしまうため名前を変更
        return specification.hasCovered();
    }

    public Type type() {
        return specification.type;
    }

    public String features() {
        return specification.features();
    }

    public boolean hasFeatures() {
        return specification.hasFeatures();
    }

    public List<Row> rows() {
        return specification.rows();
    }

    public StarterKit addRow() {
        Specification result = specification.addRow();
        return withSpecification(result);
    }

    public StarterKit removeRow(int index) {
        Specification result = specification.removeRow(index);
        return withSpecification(result);
    }

    private StarterKit withSpecification(Specification specification) {
        return new StarterKit(this.kitNumber, specification);
    }

    public StarterKit from(Specification specification) {
        return new StarterKit(KitNumber.numbering(), specification);
    }

    @Override
    public String toString() {
        return "StarterKit{" +
                "kitNumber=" + kitNumber +
                ", specification=" + specification +
                '}';
    }
}
