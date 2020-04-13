package example.domain.model.product;

import example.domain.identity.KitNumber;
import example.domain.type.Cover;
import example.domain.type.DateOfSeed;
import example.domain.type.Type;

/**
 * ハーブ栽培キット
 */
public class StarterKit {
    KitNumber kitNumber;
    DateOfSeed dateOfSeed;
    Cover cover;
    Type type;

    public StarterKit() {}

    public String dateOfSeed() {
        return dateOfSeed.when();
    }

    public Cover cover() {
        return cover;
    }

    public Type type() {
        return type;
    }

    @Override
    public String toString() {
        return "StarterKit{" +
                "kitNumber=" + kitNumber +
                ", dateOfSeed=" + dateOfSeed +
                ", cover=" + cover +
                ", type=" + type +
                '}';
    }
}
