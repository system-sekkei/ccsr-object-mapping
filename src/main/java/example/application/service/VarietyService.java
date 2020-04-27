package example.application.service;

import example.application.repository.VarietyRepository;
import example.domain.model.kit.row.Variety;
import org.springframework.stereotype.Service;

/**
 * 品種の参照サービス
 */
@Service
public class VarietyService {
    VarietyRepository varietyRepository;

    public VarietyService(VarietyRepository varietyRepository) {
        this.varietyRepository = varietyRepository;
    }

    /**
     * 品種を一覧する
     * @return
     */
    public Variety[] listAll() {
        return varietyRepository.listAll();
    }
}
