package com.beerontology.jms.producer;

import com.beerontology.domain.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {
    private static final Beer SKOL_BEER= new Beer("Skol", "Pilsen", "Skol");

    @Autowired
    JmsTemplate jmsTemplate;

    @RequestMapping("/skol")
    public Beer skol() {
        jmsTemplate.convertAndSend("beerQueue", SKOL_BEER);
        return SKOL_BEER;
    }
}
