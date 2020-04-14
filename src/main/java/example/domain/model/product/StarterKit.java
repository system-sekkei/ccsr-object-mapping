package example.domain.model.product;

import example.domain.identity.KitNumber;
import example.domain.type.Cover;
import example.domain.type.DateOfSeed;
import example.domain.type.Feature;
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
    @Override
    public String toString() {
        return "StarterKit{" +
                "kitNumber=" + kitNumber +
                ", dateOfSeed=" + dateOfSeed +
                ", cover=" + cover +
                ", type=" + type +
                ", features=" + features +
                '}';
    }
}
