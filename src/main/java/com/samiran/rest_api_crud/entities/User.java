package com.samiran.rest_api_crud.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private  int id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_email")
    private String email;

//    public String getUser_email() {
//        return user_email;
//    }
//
//    public void setUser_email(String user_email) {
//        this.user_email = user_email;
//    }
//
//    public String getUser_name() {
//        return user_name;
//    }
//
//    public void setUser_name(String user_name) {
//        this.user_name = user_name;
//    }
}
