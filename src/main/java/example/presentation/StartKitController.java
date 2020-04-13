package example.presentation;

import example.application.service.StarterKitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 栽培キット画面
 */
@Controller
@RequestMapping("/products")
public class StartKitController {
    StarterKitService starterKitService;

    public StartKitController(StarterKitService starterKitService) {
        this.starterKitService = starterKitService;
    }

    @GetMapping("")
    String listAll(Model model) {
        model.addAttribute("startKitList", starterKitService.listAll());
        return "product/list";
    }
}
