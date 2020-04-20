package example.application.service;

import example.application.repository.VarietyRepository;
import example.domain.model.product.row.Variety;
import org.springframework.stereotype.Service;

@Service
public class VarietyRegisterService {
    VarietyRepository varietyRepository;

    public VarietyRegisterService(VarietyRepository varietyRepository) {
        this.varietyRepository = varietyRepository;
    }

    public void register(Variety variety) {
        varietyRepository.register(variety);
    }
}
