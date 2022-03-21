package com.ApiRest.api.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@Getter
@Setter
public class User {
    private Integer id;
    private String login;
    private String password;

    public User(String login , String password){
        this.login = login;
        this.password = password;
    }

}
