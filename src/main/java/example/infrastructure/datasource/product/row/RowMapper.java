package example.infrastructure.datasource.product.row;

import example.domain.identity.KitNumber;
import example.domain.model.product.StarterKit;
import example.domain.model.product.row.Row;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 特徴オブジェクトの取得
 */

@Mapper
public interface RowMapper {
    List<Row> featuresFor(KitNumber kitNumber);

    void recordRows(StarterKit starterKit);
}
