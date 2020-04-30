package example.application.service;

import example.application.repository.StarterKitRepository;
import example.domain.model.kit.StarterKit;
import org.springframework.stereotype.Service;

/**
 * ハーブ栽培キット登録サービス
 */
@Service
public class StarterKitRegisterService {
    StarterKitRepository starterKitRepository;

    public StarterKitRegisterService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    /**
     * ハーブ栽培キットを登録する
     * @param starterKit
     */
    public void register(StarterKit starterKit) {
        starterKitRepository.register(starterKit);
    }
}
