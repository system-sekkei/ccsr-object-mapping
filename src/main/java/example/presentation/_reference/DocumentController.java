package example.presentation._reference;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/references")
public class DocumentController {
    @GetMapping("{page}")
    String guides(@PathVariable String page) {
        return "_reference/" + page;
    }
}