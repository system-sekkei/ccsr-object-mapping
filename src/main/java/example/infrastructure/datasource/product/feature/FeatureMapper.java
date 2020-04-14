package example.infrastructure.datasource.product.feature;

import example.domain.identity.KitNumber;
import example.domain.model.product.StarterKit;
import example.domain.type.Feature;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 特徴オブジェクトの取得
 */

@Mapper
public interface FeatureMapper {
    List<Feature> featuresFor(KitNumber kitNumber);
}
