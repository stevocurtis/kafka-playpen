package com.fenixinfotech.kafka.playpen.com.fenixinfotech.kafka.playpen.eai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InboundRestController {

    @GetMapping("/ping")
    public String ping() {
        return "{\n" +
                "  \"pingStatus\": \"ALIVE\"\n" +
                "}";
    }
}
