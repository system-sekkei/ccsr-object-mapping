package example.application.repository;

import example.domain.model.kit.row.Variety;

import java.util.List;

/**
 * ハーブ品種リポジトリ
 */
public interface VarietyRepository {
    List<Variety> listAll() ;

    void register(Variety variety);
}
