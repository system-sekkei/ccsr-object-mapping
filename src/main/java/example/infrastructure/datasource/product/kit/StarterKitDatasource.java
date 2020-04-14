package example.infrastructure.datasource.product.kit;

import example.application.repository.StarterKitRepository;
import example.domain.identity.KitNumber;
import example.domain.model.product.StarterKit;
import example.domain.model.product.StarterKitList;
import example.infrastructure.datasource.product.feature.FeatureMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StarterKitDatasource implements StarterKitRepository {

    StarterKitMapper starterKitMapper;
    FeatureMapper featureMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public StarterKitDatasource(StarterKitMapper starterKitMapper, FeatureMapper featureMapper) {
        this.starterKitMapper = starterKitMapper;
        this.featureMapper = featureMapper;
    }

    @Override
    public StarterKitList listAll() {
        List<StarterKit> result = starterKitMapper.listAll();
        if (result == null) return StarterKitList.empty();
        return StarterKitList.from(result);
    }

    @Override
    public StarterKit findBy(KitNumber kitNumber) {
        return starterKitMapper.findBy(kitNumber);
    }
}
