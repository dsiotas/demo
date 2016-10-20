package com.siotas;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
    public String getUSD(){
        return "1.00";
    }

    public String getERROR(){
        return "NOT SUPPORTED";
    }

}
