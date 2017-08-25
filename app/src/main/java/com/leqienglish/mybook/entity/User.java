package com.leqienglish.mybook.entity;

/**
 * Created by zhuqing on 2017/7/21.
 */
public class User extends Entity{

    private String name;
    private String password;
    private String email;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
