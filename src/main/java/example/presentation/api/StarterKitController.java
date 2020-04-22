package example.presentation.api;

import example.application.service.StarterKitService;
import example.domain.model.product.StarterKitList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("API栽培キット")
@RequestMapping("/api/products")
public class StarterKitController {

    StarterKitService starterKitService;

    public StarterKitController(StarterKitService starterKitService) {
        this.starterKitService = starterKitService;
    }

    @GetMapping
    StarterKitList listAll() {
        return starterKitService.listAll();
    }
}
