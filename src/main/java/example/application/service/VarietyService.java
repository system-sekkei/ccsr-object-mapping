package example.application.service;

import example.application.repository.VarietyRepository;
import example.domain.model.product.row.Variety;
import org.springframework.stereotype.Service;

@Service
public class VarietyService {
    VarietyRepository varietyRepository;

    public VarietyService(VarietyRepository varietyRepository) {
        this.varietyRepository = varietyRepository;
    }

    public Variety[] listAll() {
        return varietyRepository.listAll();
    }
}
