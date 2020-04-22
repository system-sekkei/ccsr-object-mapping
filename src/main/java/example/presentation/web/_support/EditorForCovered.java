package example.presentation.web._support;

import example.domain.type.Covered;

import java.beans.PropertyEditorSupport;
import java.util.Set;

public class EditorForCovered extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        return getValue().toString();
    }

    @Override
    public void setAsText(String text) {
        setValue(from(text));
    }

    private Covered from(String text) {
        String[] values = text.split(",");
        Set<String> set = Set.of(values);

        if (set.contains("checked")) return Covered.有;
        if (set.contains("unchecked")) return Covered.無;

        throw new IllegalArgumentException("不正な値:" + text);
    }
}
