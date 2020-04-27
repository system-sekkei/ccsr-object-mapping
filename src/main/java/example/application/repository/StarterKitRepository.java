package example.application.repository;

import example.domain.identity.KitNumber;
import example.domain.model.kit.StarterKit;
import example.domain.model.kit.StarterKitList;

public interface StarterKitRepository {
    StarterKitList listAll();

    StarterKit findBy(KitNumber kitNumber);

    void register(StarterKit starterKit);
}
