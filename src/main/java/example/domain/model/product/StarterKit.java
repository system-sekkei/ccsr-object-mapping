package example.domain.model.product;

import example.domain.identity.KitNumber;
import example.domain.model.product.feature.Features;
import example.domain.model.product.row.Row;
import example.domain.model.product.row.Rows;
import example.domain.type.Cover;
import example.domain.type.Type;

import java.util.List;

/**
 * ハーブ栽培キット
 */
public class StarterKit {
    KitNumber kitNumber;
    DateOfSeed dateOfSeed;
    Cover cover;
    Type type;

    Features features;
    Rows rows;

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

    public Cover cover() {
        return cover;
    }

    public Type type() {
        return type;
    }

    public String features() {
        return features.show();
    }

    public List<Row> rows() {
        return rows.asList();
    }

    @Override
    public String toString() {
        return "StarterKit{" +
                "kitNumber=" + kitNumber +
                ", dateOfSeed=" + dateOfSeed +
                ", cover=" + cover +
                ", type=" + type +
                ", features=" + features +
                ", rows=" + rows +
                '}';
    }

    public static StarterKit prototype() {
        return new StarterKit(KitNumber.numbering());
    }
}
