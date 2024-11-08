package com.samiran.rest_api_crud;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env" , havingValue = "development")
public class DevDb implements DB {

    public String getData(){
        return "Dev Data";
    }
}
