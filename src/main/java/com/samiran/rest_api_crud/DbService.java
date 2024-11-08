package com.samiran.rest_api_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbService {
//    @Autowired
    private DevDb db;

    String getData(){
        return db.getData();
    }
}
