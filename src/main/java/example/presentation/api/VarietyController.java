package example.presentation.api;

import example.application.service.VarietyRegisterService;
import example.application.service.VarietyService;
import example.domain.model.kit.row.Variety;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * API ハーブの品種
 */
@RestController("APIハーブの品種")
@RequestMapping("/api/varieties")
public class VarietyController {
    VarietyService varietyService;
    VarietyRegisterService varietyRegisterService;

    public VarietyController(VarietyService varietyService, VarietyRegisterService varietyRegisterService) {
        this.varietyService = varietyService;
        this.varietyRegisterService = varietyRegisterService;
    }

    @GetMapping("")
    Variety[] listAll() {
        return varietyService.listAll();
    }

    @PostMapping
    Variety register(@RequestBody @Validated Variety variety,
                     BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException(bindingResult.toString());
        }
        varietyRegisterService.register(variety);
        return variety;
    }
}