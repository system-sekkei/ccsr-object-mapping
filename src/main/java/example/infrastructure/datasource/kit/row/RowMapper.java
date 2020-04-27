package example.infrastructure.datasource.kit.row;

import example.domain.identity.KitNumber;
import example.domain.model.kit.StarterKit;
import example.domain.model.kit.row.Row;
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
