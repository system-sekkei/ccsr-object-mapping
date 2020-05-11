package example.application.service;

import example.application.repository.VarietyRepository;
import example.domain.model.kit.row.Varieties;
import org.springframework.stereotype.Service;

/**
 * ハーブ品種の参照サービス
 */
@Service
public class VarietyService {
    VarietyRepository varietyRepository;

    public VarietyService(VarietyRepository varietyRepository) {
        this.varietyRepository = varietyRepository;
    }

    /**
     * ハーブ品種を一覧する
     * @return
     */
    public Varieties listAll() {
        return varietyRepository.listAll();
    }
}
