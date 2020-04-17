package example.presentation;

import example.application.service.StarterKitService;
import example.domain.model.product.StarterKit;
import example.domain.model.product.StarterKitList;
import example.domain.model.product.feature.Feature;
import example.domain.type.Type;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @ModelAttribute("allFeatures")
    Feature[] allFeatures() {
        return Feature.values();
    }
    @ModelAttribute("allTypes")
    Type[] allTypes() {
        return Type.values();
    }

    @GetMapping("")
    String listAll(Model model) {
        return newForm(model);
    }

    @PostMapping("")
    String register(@ModelAttribute("starterKit") @Validated StarterKit starterKit,
                    BindingResult bindingResult,
                    Model model) {
        if (bindingResult.hasErrors()) {
            return "product/list";
        }
        System.out.println(starterKit);
        // 登録
        return newForm(model);
    }

    String newForm(Model model) {
        model.addAttribute("starterKit", StarterKit.prototype());
        return "product/list";
    }
}
