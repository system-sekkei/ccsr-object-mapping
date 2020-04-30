package example.infrastructure.datasource.kit.feature;

import example.domain.model.kit.StarterKit;
import org.apache.ibatis.annotations.Mapper;

/**
 * 特徴のマッピング
 */

@Mapper
public interface FeatureMapper {
    void recordFeatures(StarterKit starterKit);
}