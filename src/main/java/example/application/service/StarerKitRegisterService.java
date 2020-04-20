package example.application.service;

import example.application.repository.StarterKitRepository;
import example.domain.model.product.StarterKit;
import org.springframework.stereotype.Service;

@Service
public class StarerKitRegisterService {
    StarterKitRepository starterKitRepository;

    public StarerKitRegisterService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    public void register(StarterKit starterKit) {
        starterKitRepository.register(starterKit);
    }
}
