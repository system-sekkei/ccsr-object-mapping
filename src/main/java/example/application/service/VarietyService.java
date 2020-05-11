package example.application.service;

import example.application.repository.VarietyRepository;
import example.domain.model.kit.row.Variety;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Variety> listAll() {
        return varietyRepository.listAll();
    }
}
