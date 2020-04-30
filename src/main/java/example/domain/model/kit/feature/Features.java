package example.domain.model.kit.feature;

import java.util.ArrayList;
import java.util.List;

/**
 * 特徴
 */
public class Features {
    List<Feature> list;

    private String show() {
        List<String> result = new ArrayList<>();
        for (Feature each : list) result.add(each.toString());
        return String.join("、", result);
    }

    public boolean hasFeatures() {
        return list.size() > 0 ;
    }

    @Override
    public String toString() {
        return show();
    }
}

