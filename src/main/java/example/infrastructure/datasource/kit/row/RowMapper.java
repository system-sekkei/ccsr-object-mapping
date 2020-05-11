package example.infrastructure.datasource.kit.row;

import example.domain.model.kit.KitNumber;
import example.domain.model.kit.row.Row;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 列オブジェクトの取得
 */

@Mapper
public interface RowMapper {
    void recordRows(@Param("kitNumber")KitNumber kitNumber, @Param("rows") List<Row> rows);
}