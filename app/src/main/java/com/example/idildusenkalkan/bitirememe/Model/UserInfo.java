package com.example.idildusenkalkan.bitirememe.Model;

public class UserInfo {
    private String password ;
    private int id ;

    public UserInfo (String password, int id){
        this.id=id;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
