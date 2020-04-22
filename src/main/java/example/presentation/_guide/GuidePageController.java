package example.presentation._guide;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("guides")
public class GuidePageController {
    @GetMapping
    String guides() {
        return "_guide/html5tags";
    }
}
