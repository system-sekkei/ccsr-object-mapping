package example.infrastructure.datasource.kit.feature;

import example.domain.identity.KitNumber;
import example.domain.model.kit.StarterKit;
import example.domain.model.kit.feature.Feature;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 特徴のマッピング
 */

@Mapper
public interface FeatureMapper {
    List<Feature> featuresFor(KitNumber kitNumber);

    void recordFeatures(StarterKit starterKit);
}