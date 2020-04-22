package example.presentation.web.product;

import example.application.service.StarerKitRegisterService;
import example.application.service.StarterKitService;
import example.application.service.VarietyService;
import example.domain.model.product.StarterKit;
import example.domain.model.product.StarterKitList;
import example.domain.model.product.feature.Feature;
import example.domain.model.product.row.Variety;
import example.domain.model.product.row.validation.AddRow;
import example.domain.model.product.row.validation.RemoveRow;
import example.domain.type.Type;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 栽培キットの一覧・登録
 */
@Controller
@RequestMapping("/products")
public class StarterKitController {
    StarterKitService starterKitService;
    StarerKitRegisterService starerKitRegisterService;
    VarietyService varietyService;

    public StarterKitController(StarterKitService starterKitService, StarerKitRegisterService starerKitRegisterService, VarietyService varietyService) {
        this.starterKitService = starterKitService;
        this.starerKitRegisterService = starerKitRegisterService;
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
        // 以下が追加された modelを参照して view が生成される
        // メソッドレベルの@ModelAttributeで追加された各オブジェクト
        // このメソッドの引数として生成された StarterKitのオブジェクト
        return "product/listAndForm";
    }

    @PostMapping(value = "", params = "save")
    String register(@ModelAttribute("starterKit") @Validated StarterKit starterKit,
                    BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "product/listAndForm";
        }

        starerKitRegisterService.register(starterKit);
        return "redirect:/products";
    }

    @PostMapping(value = "", params = "addRow")
    String addRow(@ModelAttribute("starterKit") @Validated(AddRow.class) StarterKit starterKit,
                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "product/listAndForm";
        }
        starterKit.addRow();
        return "product/listAndForm";
    }

    @PostMapping(value = "", params = "removeRow")
    String removeRow(@ModelAttribute("starterKit") @Validated(RemoveRow.class) StarterKit starterKit,
                     BindingResult bindingResult,
                     @RequestParam("removeRow") int index) {
        if (bindingResult.hasErrors()) {
            return "product/listAndForm";
        }
        starterKit.removeRow(index);
        return "product/listAndForm";
    }
}
