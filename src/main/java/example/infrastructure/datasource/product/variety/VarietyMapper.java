package example.infrastructure.datasource.product.variety;

import example.domain.model.product.row.Variety;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VarietyMapper {
    Variety[] listAll();

    void register(Variety variety);
}
