package eblevin.app.gcnhelper;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GCNController {
    
    @GetMapping("/")
    public String index() {
        return new String("Hello, World!");
    }
    
}
