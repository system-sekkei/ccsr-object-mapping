package example.domain.model._sample;

import java.util.List;

public class Actions {
    List<Action> list;

    public Actions(List<Action> list) {
        this.list = list;
    }

    @Deprecated
    public Actions() {}

    public List<Action> list() {
        return list;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "list=" + list +
                '}';
    }
}
