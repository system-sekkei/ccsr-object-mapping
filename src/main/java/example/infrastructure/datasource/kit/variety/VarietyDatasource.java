package example.infrastructure.datasource.kit.variety;

import example.application.repository.VarietyRepository;
import example.domain.model.kit.row.Varieties;
import example.domain.model.kit.row.Variety;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VarietyDatasource implements VarietyRepository {

    VarietyMapper varietyMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public VarietyDatasource(VarietyMapper varietyMapper) {
        this.varietyMapper = varietyMapper;
    }

    @Override
    public Varieties listAll() {
        List<Variety> result = varietyMapper.listAll();
        return Varieties.from(result);
    }

    @Override
    public void register(Variety variety) {
        varietyMapper.register(variety);
    }
}
