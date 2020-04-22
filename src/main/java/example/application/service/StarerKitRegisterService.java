package example.application.service;

import example.application.repository.StarterKitRepository;
import example.domain.model.product.StarterKit;
import org.springframework.stereotype.Service;

/**
 * 栽培キット登録サービス
 */
@Service
public class StarerKitRegisterService {
    StarterKitRepository starterKitRepository;

    public StarerKitRegisterService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    /**
     * 栽培キットを登録する
     * @param starterKit
     */
    public void register(StarterKit starterKit) {
        starterKitRepository.register(starterKit);
    }
}
