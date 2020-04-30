package example.application.repository;

import example.domain.model.kit.row.Variety;

/**
 * ハーブ品種リポジトリ
 */
public interface VarietyRepository {
    Variety[] listAll() ;

    void register(Variety variety);
}
