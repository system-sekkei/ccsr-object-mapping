package example.infrastructure.datasource.product;

import example.domain.identity.ProductNumber;
import example.domain.model.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品関連のオブジェクトを操作するためのSQLマッパーのインタフェース宣言
 */

@Mapper // ← データアクセスオブジェクトを自動生成するアノテーション

public interface ProductMapper {
    List<Product> listAll();

    Product findBy(ProductNumber productNumber);
}
