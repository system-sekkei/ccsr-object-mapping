package example.infrastructure.datasource.kit.variety;

import example.domain.model.kit.row.Variety;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VarietyMapper {
    Variety[] listAll();

    void register(Variety variety);
}
