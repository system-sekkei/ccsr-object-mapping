package example.application.repository;

import example.domain.model.product.row.Variety;

public interface VarietyRepository {
    Variety[] listAll() ;

    void register(Variety variety);
}
