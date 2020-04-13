package example.application.service;

import example.application.repository.StarterKitRepository;
import example.domain.identity.KitNumber;
import example.domain.model.product.StarterKit;
import example.domain.model.product.StarterKitList;
import org.springframework.stereotype.Service;

/**
 * 栽培キットサービス
 */
@Service
public class StarterKitService {
    StarterKitRepository starterKitRepository;

    public StarterKitService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    public StarterKitList listAll() {
        return starterKitRepository.listAll();
    }

    public StarterKit findBy(KitNumber kitNumber) {
        return starterKitRepository.findBy(kitNumber);
    }
}
