package example.infrastructure.datasource.kit.variety;

import example.domain.model.kit.row.Variety;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VarietyMapper {
    List<Variety> listAll();

    void register(Variety variety);
}
