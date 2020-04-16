package example.domain.model.product.feature;

import java.util.ArrayList;
import java.util.List;

/**
 * 特徴
 */
public class Features {
    List<Feature> list;

    public String show() {
        List<String> result = new ArrayList<>();
        for (Feature each : list) result.add(each.toString());
        return String.join("、", result);
    }
    @Override
    public String toString() {
        return "Features{" +
                "list=" + list +
                '}';
    }
}

