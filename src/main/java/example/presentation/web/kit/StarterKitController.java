package example.presentation.web.kit;

import example.application.service.StarterKitRegisterService;
import example.application.service.StarterKitService;
import example.application.service.VarietyService;
import example.domain.model.kit.StarterKit;
import example.domain.model.kit.StarterKitList;
import example.domain.model.kit.feature.Feature;
import example.domain.model.kit.row.Variety;
import example.domain.model.kit.row.validation.AddRow;
import example.domain.model.kit.row.validation.RemoveRow;
import example.domain.type.Type;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * 栽培キットの一覧・登録 画面
 */
@Controller
@RequestMapping("/kits")
public class StarterKitController {
    StarterKitService starterKitService;
    StarterKitRegisterService starterKitRegisterService;
    VarietyService varietyService;

    public StarterKitController(StarterKitService starterKitService, StarterKitRegisterService starterKitRegisterService, VarietyService varietyService) {
        this.starterKitService = starterKitService;
        this.starterKitRegisterService = starterKitRegisterService;
        this.varietyService = varietyService;
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

    @ModelAttribute("allVarieties")
    Variety[] allVarieties() {
        return varietyService.listAll();
    }

    /**
     * 一覧表示と登録フォーム
     * @param starterKit
     * @return
     */
    @GetMapping("")
    String listAll(@ModelAttribute("starterKit") StarterKit starterKit) {
        return "kit/listAndForm";
    }

    @PostMapping(value = "", params = "save")
    String register(@ModelAttribute("starterKit") @Validated StarterKit starterKit,
                    BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "kit/listAndForm";
        }

        starterKitRegisterService.register(starterKit);
        return "redirect:/kits";
    }

    @PostMapping(value = "", params = "addRow")
    String addRow(@ModelAttribute("starterKit") @Validated(AddRow.class) StarterKit starterKit,
                  BindingResult bindingResult,
                  Model model) {
        if (bindingResult.hasErrors()) {
            return "kit/listAndForm";
        }
        StarterKit result = starterKit.addRow();
        model.addAttribute("starterKit", result);

        return "kit/listAndForm";
    }

    @PostMapping(value = "", params = "removeRow")
    String removeRow(@ModelAttribute("starterKit") @Validated(RemoveRow.class) StarterKit starterKit,
                     BindingResult bindingResult,
                     Model model,
                     @RequestParam("removeRow") int index) {
        if (bindingResult.hasErrors()) {
            return "kit/listAndForm";
        }

        StarterKit result = starterKit.removeRow(index);
        model.addAttribute("starterKit", result);
        return "kit/listAndForm";
    }

    @InitBinder
    void initBinder(WebDataBinder binder) {
        binder.setAllowedFields(
                "kitNumber.value",
                "dateOfSeed.value",
                "covered",
                "type",
                "features.list",
                "rows.list*" // 複数行
        );
    }
}
