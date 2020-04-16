package example.presentation;

import example.application.service.StarterKitService;
import example.domain.model.product.StarterKit;
import example.domain.model.product.StarterKitList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @ModelAttribute("starterKitList")
    StarterKitList startKitList() {
        return starterKitService.listAll();
    }

    @GetMapping("")
    String listAll(Model model) {
        model.addAttribute("starterKit", StarterKit.prototype());
        return "product/list";
    }

    @PostMapping("")
    String register(@ModelAttribute("starterKit") @Validated StarterKit starterKit) {
        System.out.println(starterKit);
        return "product/list";
    }
}
