import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/antifraud")
public class AntifraudController {

    private final AntifraudService antifraudService;

    @Autowired
    public AntifraudController(AntifraudService antifraudService) {
        this.antifraudService = antifraudService;
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validateTransaction(@RequestBody AntifraudModel antifraudModel) {
        boolean isFraudulent = antifraudService.checkFraudRisk(antifraudModel);
        if (isFraudulent) {
            return ResponseEntity.badRequest().body("Transaction is flagged as fraudulent.");
        }
        return ResponseEntity.ok("Transaction is valid.");
    }
}