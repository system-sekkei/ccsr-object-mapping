package example.domain.model.product;

import java.util.Collections;
import java.util.List;

/**
 * 栽培キット一覧
 */
public class StarterKitList {
    List<StarterKit> list;

    private StarterKitList(List<StarterKit> source) {
        list = source;
    }

    public String count() {
        if (list.isEmpty()) return "商品はありません";
        return String.format("%d点", list.size());
    }

    public List<StarterKit> asList() {
        return list;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "list=" + list +
                '}';
    }

    public static StarterKitList from(List<StarterKit> source) {
        return new StarterKitList(source);
    }

    public static StarterKitList empty() {
        return new StarterKitList(Collections.emptyList());
    }
}
