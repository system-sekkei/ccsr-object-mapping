package example.presentation.api.kit;

import example.application.service.StarterKitRegisterService;
import example.application.service.StarterKitService;
import example.domain.identity.KitNumber;
import example.domain.model.kit.specification.Specification;
import example.domain.model.kit.StarterKit;
import example.domain.model.kit.StarterKitList;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * API ハーブ栽培キット
 */
@RestController("APIハーブ栽培キット")
@RequestMapping("/api/starterkits")
public class StarterKitController {

    StarterKitService starterKitService;
    StarterKitRegisterService registerService;

    public StarterKitController(StarterKitService starterKitService, StarterKitRegisterService registerService) {
        this.starterKitService = starterKitService;
        this.registerService = registerService;
    }

    @GetMapping
    StarterKitList listAll() {
        return starterKitService.listAll();
    }

    @PostMapping
    KitNumber register(@RequestBody @Validated Specification specification,
                       BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException(bindingResult.toString());
        }

        StarterKit starterKit = StarterKit.from(specification);
        registerService.register(starterKit);
        return starterKit.kitNumber();
    }
}
