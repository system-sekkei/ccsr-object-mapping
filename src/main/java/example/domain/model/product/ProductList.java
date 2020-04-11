package example.domain.model.product;

import java.util.Collections;
import java.util.List;

public class ProductList {
    List<Product> list;

    private ProductList(List<Product> source) {
        list = source;
    }

    public String count() {
        if (list.isEmpty()) return "商品はありません";
        return String.format("%d点", list.size());
    }

    public List<Product> asList() {
        return list;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "list=" + list +
                '}';
    }

    public static ProductList from(List<Product> source) {
        return new ProductList(source);
    }

    public static ProductList empty() {
        return new ProductList(Collections.emptyList());
    }
}
