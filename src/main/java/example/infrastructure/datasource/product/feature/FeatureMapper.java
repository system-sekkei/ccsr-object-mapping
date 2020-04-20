package example.infrastructure.datasource.product.feature;

import example.domain.identity.KitNumber;
import example.domain.model.product.StarterKit;
import example.domain.model.product.feature.Feature;
import example.domain.model.product.feature.Features;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 特徴のマッピング
 */

@Mapper
public interface FeatureMapper {
    List<Feature> featuresFor(KitNumber kitNumber);

    void recordFeatures(StarterKit starterKit);
}