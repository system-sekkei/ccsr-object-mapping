package example.application._sample;

import example.domain.model._sample.Action;
import example.domain.model._sample.Actions;

public interface ActionRepository {
    Actions listActions();

    void register(Action action);
}
