package example.presentation._guide;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("guides")
public class GuidePageController {
    @GetMapping("{page}")
    String guides(@PathVariable String page) {
        return "_guide/" + page;
    }
}