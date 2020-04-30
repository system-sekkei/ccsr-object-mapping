package example.infrastructure.datasource.kit.kit;

import example.application.repository.StarterKitRepository;
import example.domain.identity.KitNumber;
import example.domain.model.kit.specification.Specification;
import example.domain.model.kit.StarterKit;
import example.domain.model.kit.StarterKitList;
import example.infrastructure.datasource.kit.feature.FeatureMapper;
import example.infrastructure.datasource.kit.row.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StarterKitDatasource implements StarterKitRepository {

    StarterKitMapper starterKitMapper;
    FeatureMapper featureMapper;
    RowMapper rowMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public StarterKitDatasource(StarterKitMapper starterKitMapper, FeatureMapper featureMapper, RowMapper rowMapper) {
        this.starterKitMapper = starterKitMapper;
        this.featureMapper = featureMapper;
        this.rowMapper = rowMapper;
    }

    @Override
    public StarterKitList listAll() {
        List<StarterKit> result = starterKitMapper.listAll();
        if (result == null) return StarterKitList.empty();
        return StarterKitList.from(result);
    }

    @Override
    public void register(StarterKit starterKit) {
        starterKitMapper.register(starterKit);
        Specification specification = starterKit.specification();
        if (specification.hasFeatures()) featureMapper.recordFeatures(starterKit);
        rowMapper.recordRows(starterKit.kitNumber(), specification.rows());
    }
}
