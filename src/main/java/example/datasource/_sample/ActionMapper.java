package example.datasource._sample;

import example.domain.model._sample.Action;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActionMapper {
    List<Action> list();

    void register(Action action);
}
