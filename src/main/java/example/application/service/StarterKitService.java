package example.application.service;

import example.application.repository.StarterKitRepository;
import example.domain.identity.KitNumber;
import example.domain.model.product.StarterKit;
import example.domain.model.product.StarterKitList;
import org.springframework.stereotype.Service;

/**
 * 栽培キット参照サービス
 */
@Service
public class StarterKitService {
    StarterKitRepository starterKitRepository;

    public StarterKitService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    /**
     * 栽培キットを一覧する
     */
    public StarterKitList listAll() {
        return starterKitRepository.listAll();
    }

    /**
     * 栽培キットを取得する
     * @param kitNumber
     * @return
     */
    public StarterKit findBy(KitNumber kitNumber) {
        return starterKitRepository.findBy(kitNumber);
    }
}
