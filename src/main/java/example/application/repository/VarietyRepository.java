package example.application.repository;

import example.domain.model.kit.row.Variety;

public interface VarietyRepository {
    Variety[] listAll() ;

    void register(Variety variety);
}
