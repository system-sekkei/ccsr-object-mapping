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
    String listAll(@ModelAttribute("starterKit") StarterKit starterKit) {
        // 以下が追加された modelを参照して view が生成される
        // メソッドレベルの@ModelAttributeで追加された各オブジェクト
        // このメソッドの引数として生成された StarterKitのオブジェクト
        return "product/list";
    }

    @PostMapping(value = "", params = "save")
    String register(@ModelAttribute("starterKit") @Validated StarterKit starterKit,
                    BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "product/list";
        }
        // Modelに追加された StarterKitオブジェクト（バインド済）
        System.out.println(starterKit);
        // 登録
        return "product/list";
    }

    @PostMapping(value = "", params = "addRow")
    String addRow(@ModelAttribute("starterKit") @Validated StarterKit starterKit,
                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "product/list";
        }
        starterKit.addRow();
        return "product/list";
    }
}
