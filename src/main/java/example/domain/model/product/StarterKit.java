package example.domain.model.product;

import example.domain.identity.KitNumber;
import example.domain.primivites.DateOfSeed;

/**
 * ハーブ栽培キット
 */
public class StarterKit {
    KitNumber kitNumber;
    DateOfSeed dateOfSeed;

    private StarterKit(KitNumber kitNumber, DateOfSeed dateOfSeed) {
        this.kitNumber = kitNumber;
        this.dateOfSeed = dateOfSeed;
    }

    public StarterKit() {}

    @Override
    public String toString() {
        return "StarterKit{" +
                "kitNumber=" + kitNumber +
                ", dateOfSeed=" + dateOfSeed +
                '}';
    }

}
