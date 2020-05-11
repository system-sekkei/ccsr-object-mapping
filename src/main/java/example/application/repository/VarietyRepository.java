package example.application.repository;

import example.domain.model.kit.row.Varieties;
import example.domain.model.kit.row.Variety;

/**
 * ハーブ品種リポジトリ
 */
public interface VarietyRepository {
    Varieties listAll() ;

    void register(Variety variety);
}
