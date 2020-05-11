package example.domain.model.kit.row;

import java.util.List;

/**
 * ハーブ品種一覧
 */
public class Varieties {
    List<Variety> list;

    private Varieties(List<Variety> list) {
        this.list = list;
    }

    public List<Variety> asList() {
        return list;
    }
    public static Varieties from(List<Variety> list) {
        return new Varieties(list);
    }
}
