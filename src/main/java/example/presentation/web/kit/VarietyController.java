package example.presentation.web.kit;

import example.application.service.VarietyRegisterService;
import example.application.service.VarietyService;
import example.domain.model.kit.row.Variety;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * ハーブ品種の管理画面
 */
@Controller
@RequestMapping("/varieties")
public class VarietyController {

    VarietyService varietyService;
    VarietyRegisterService varietyRegisterService;

    // コンストラクタでインジェクション @Autowiredは記述不要
    public VarietyController(VarietyService varietyService, VarietyRegisterService varietyRegisterService) {
        this.varietyService = varietyService;
        this.varietyRegisterService = varietyRegisterService;
    }

    @ModelAttribute("allVarieties")
    Variety[] allVarieties() {
        return varietyService.listAll();
    }

    @GetMapping("")
    public String list(@ModelAttribute("variety") Variety variety) {
        return "variety/listAndForm";
    }

    @PostMapping("")
    public String register(
            @ModelAttribute("variety") @Validated Variety variety,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "variety/listAndForm";

        varietyRegisterService.register(variety);
        return "redirect:/varieties";
    }

    // バインドを許可するフィールドを指定する
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("varietyName.value");
    }
}
