package com.titov.eureka_config_client_client.ontroller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CardController {

    @RolesAllowed({"admin", "user"})
    @GetMapping("lastCard")
    String getCardId() {
        return "ONE" + UUID.randomUUID().toString();
    }
}

