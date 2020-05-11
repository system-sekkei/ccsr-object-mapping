package example.presentation.api.kit;

import example.application.service.VarietyRegisterService;
import example.application.service.VarietyService;
import example.domain.model.kit.row.Varieties;
import example.domain.model.kit.row.Variety;
import example.domain.model.kit.row.VarietyName;
import example.domain.model.kit.row.VarietyNumber;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * API ハーブ品種
 */
@RestController("ハーブ品種API")
@RequestMapping("/api/varieties")
public class VarietyController {
    VarietyService varietyService;
    VarietyRegisterService varietyRegisterService;

    public VarietyController(VarietyService varietyService, VarietyRegisterService varietyRegisterService) {
        this.varietyService = varietyService;
        this.varietyRegisterService = varietyRegisterService;
    }

    @GetMapping
    Varieties listAll() {
        return varietyService.listAll();
    }

    @PostMapping
    VarietyNumber register(@RequestBody @Validated VarietyName varietyName) {
        Variety variety = Variety.from(varietyName);
        varietyRegisterService.register(variety);
        return variety.number();
    }
}