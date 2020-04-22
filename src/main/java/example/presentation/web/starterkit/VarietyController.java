package example.presentation.web.starterkit;

import example.application.service.VarietyRegisterService;
import example.application.service.VarietyService;
import example.domain.model.product.row.Variety;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 品種の一覧・登録
 */
@Controller
@RequestMapping("/varieties")
public class VarietyController {

    VarietyService varietyService;
    VarietyRegisterService varietyRegisterService;

    public VarietyController(VarietyService varietyService, VarietyRegisterService varietyRegisterService) {
        this.varietyService = varietyService;
        this.varietyRegisterService = varietyRegisterService;
    }

    @ModelAttribute("allVarieties")
    Variety[] allVarieties() {
        return varietyService.listAll();
    }

    @GetMapping
    public String list(@ModelAttribute("variety") Variety variety) {
        return "variety/listAndForm";
    }

    @PostMapping
    public String register(
            @ModelAttribute("variety") @Validated Variety variety,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "variety/listAndForm";
        System.out.println(variety);
        varietyRegisterService.register(variety);
        return "redirect:/varieties";
    }
}
