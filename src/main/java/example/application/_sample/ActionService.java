package example.application._sample;

import example.domain.model._sample.Action;
import example.domain.model._sample.Actions;
import org.springframework.stereotype.Service;

@Service
public class ActionService {
    ActionRepository actionRepository;

    public ActionService(ActionRepository actionRepository) {
        this.actionRepository = actionRepository;
    }

    public Actions listActions() {
        return actionRepository.listActions();
    }

    public void register(Action action) {
        actionRepository.register(action);
    }
}
