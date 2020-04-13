package example.infrastructure.datasource.product;

import example.application.repository.StarterKitRepository;
import example.domain.identity.KitNumber;
import example.domain.model.product.StarterKit;
import example.domain.model.product.StarterKitList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StarterKitDatasource implements StarterKitRepository {

    StarterKitMapper starterKitMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public StarterKitDatasource(StarterKitMapper starterKitMapper) {
        this.starterKitMapper = starterKitMapper;
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
