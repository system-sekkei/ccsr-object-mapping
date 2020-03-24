package example.presentation._sample;

import example.application._sample.ActionService;
import example.domain.model._sample.Action;
import example.domain.model._sample.Actions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

    ActionService actionService;

    public SampleController(ActionService actionService) {
        this.actionService = actionService;
    }

    @GetMapping
    String form(Model model) {
        Actions actions = actionService.listActions();
        model.addAttribute("actions", actions);
        return "_sample/form";
    }

    @ModelAttribute("action")
    Action action() {
        return new Action("既定のアクション");
    }

    @PostMapping
    String register(
            @Validated @ModelAttribute("action") Action action,
            BindingResult bindingResult,
            Model model) {
        actionService.register(action);
        Actions actions = actionService.listActions();
        model.addAttribute("actions", actions);
        return "_sample/form";
    }
}
