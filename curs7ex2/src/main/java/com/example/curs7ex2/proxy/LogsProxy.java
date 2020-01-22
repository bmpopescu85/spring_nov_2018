package com.example.curs7ex2.proxy;

import com.example.curs7ex2.proxy.dto.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LogsProxy {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${log.service.url}")
    private String logServiceUrl;

    public void sendLogs(String message) {
        Log log = new Log();
        log.setMessage(message);
        restTemplate.postForObject(logServiceUrl, log, void.class);
    }
}
