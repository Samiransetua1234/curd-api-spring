package com.samiran.rest_api_crud;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env" , havingValue = "production")
public class ProdDb implements DB{

    public String getData(){
        return "Prod Data";
    }
}
