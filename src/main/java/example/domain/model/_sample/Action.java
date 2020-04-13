package example.domain.model._sample;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

public class Action {
    @NotEmpty(message = "入力必須")
    String name;
    String identity = UUID.randomUUID().toString().substring(0,6).toUpperCase();

    public Action(String name) {
        this.name = name;
    }
    public Action() {

    }
    public String show() {
        return String.format("%s (%s)", name, identity);
    }

    @Override
    public String toString() {
        return "Action{" +
                "name='" + name + '\'' +
                ", identity=" + identity +
                '}';
    }
}
