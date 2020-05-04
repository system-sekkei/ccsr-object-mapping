package example.infrastructure.datasource.kit.kit;

import example.domain.model.kit.StarterKit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品関連のオブジェクトを操作するためのSQLマッパーのインタフェース宣言
 */

@Mapper // ← データアクセスオブジェクトを自動生成するアノテーション
public interface StarterKitMapper {
    List<StarterKit> listAll();

    void register(StarterKit starterKit);
}
