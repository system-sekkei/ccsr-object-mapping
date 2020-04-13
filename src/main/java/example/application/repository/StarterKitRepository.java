package example.application.repository;

import example.domain.identity.KitNumber;
import example.domain.model.product.StarterKit;
import example.domain.model.product.StarterKitList;

public interface StarterKitRepository {
    StarterKitList listAll();

    StarterKit findBy(KitNumber kitNumber);
}
