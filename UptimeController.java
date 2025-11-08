package com.Relay.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UptimeController {

    private final Instant startTime = Instant.now();

    @GetMapping("/uptime")
    public Map<String, Object> getUptime() {
        Map<String, Object> data = new HashMap<>();
        data.put("status", "UP");
        data.put("message", "Relay Chat App is alive 🚀");
        data.put("startedAt", startTime.toString());
        data.put("currentTime", Instant.now().toString());
        return data;
    }
}
