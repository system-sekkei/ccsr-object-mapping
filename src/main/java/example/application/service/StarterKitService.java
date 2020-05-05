package example.application.service;

import example.application.repository.StarterKitRepository;
import example.domain.model.kit.StarterKitList;
import org.springframework.stereotype.Service;

/**
 * ハーブ栽培キット参照サービス
 */
@Service
public class StarterKitService {
    StarterKitRepository starterKitRepository;

    public StarterKitService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    /**
     * ハーブ栽培キットを一覧する
     */
    public StarterKitList listAll() {
        return starterKitRepository.listAll();
    }
}
