package example.domain.model.kit;

import example.domain.identity.KitNumber;
import example.domain.model.kit.specification.Specification;

/**
 * ハーブ栽培キット
 */
public class StarterKit {
    KitNumber kitNumber = KitNumber.numbering();

    Specification specification;

    private StarterKit(KitNumber kitNumber, Specification specification) {
        this.kitNumber = kitNumber;
        this.specification = specification;
    }

    public StarterKit() {}

    public KitNumber kitNumber() {
        return kitNumber;
    }

    public Specification specification() {
        return specification;
    }

    public static StarterKit from(Specification specification) {
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
