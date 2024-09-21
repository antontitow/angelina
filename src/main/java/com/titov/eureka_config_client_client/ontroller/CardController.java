package com.titov.eureka_config_client_client.ontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.UUID;

@RestController
public class CardController {


    @GetMapping("lastCard")
    String getCardId(Principal principal) {
        return "ONE "+ principal == null ? "NO" : principal.getName() + UUID.randomUUID().toString();
    }
}

