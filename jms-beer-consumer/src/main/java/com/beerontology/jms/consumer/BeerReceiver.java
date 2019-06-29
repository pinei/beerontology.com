package com.beerontology.jms.consumer;


import com.beerontology.domain.Beer;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class BeerReceiver {
    @JmsListener(destination = "beerQueue", containerFactory = "myFactory")
    public void receiveMessage(Beer beer) {
        System.out.println("Received <" + beer + ">");
    }
}
