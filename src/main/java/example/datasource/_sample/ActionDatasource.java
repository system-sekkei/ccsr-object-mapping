package example.datasource._sample;

import example.application._sample.ActionRepository;
import example.domain.model._sample.Action;
import example.domain.model._sample.Actions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActionDatasource implements ActionRepository {

    ActionMapper actionMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public ActionDatasource(ActionMapper actionMapper) {
        this.actionMapper = actionMapper;
    }

    @Override
    public Actions listActions() {
        List<Action> result = actionMapper.list();
        System.out.println(result);
        return new Actions(result);
    }

    @Override
    public void register(Action action) {
        actionMapper.register(action);
    }
}
