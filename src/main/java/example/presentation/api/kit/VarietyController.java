package example.presentation.api.kit;

import example.application.service.VarietyRegisterService;
import example.application.service.VarietyService;
import example.domain.identity.VarietyNumber;
import example.domain.model.kit.row.Variety;
import example.domain.model.kit.row.VarietyName;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * API ハーブ品種
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
    List<Variety> listAll() {
        return varietyService.listAll();
    }

    @PostMapping("")
    VarietyNumber register(@RequestBody @Validated VarietyName varietyName,
                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException(bindingResult.toString());
        }
        Variety variety = Variety.from(varietyName);
        varietyRegisterService.register(variety);
        return variety.number();
    }
}