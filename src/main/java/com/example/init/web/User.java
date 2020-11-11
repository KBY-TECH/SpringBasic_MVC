package com.example.init.web;

public class User {
    private String username;
    private String email;
    private String pw;
    private String pw2;
//   Win: Alt + Insert (get/set)


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", pw='" + pw + '\'' +
                ", pw2='" + pw2 + '\'' +

                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPw() {
        return pw;
    }

    public String getPw2() {
        return pw2;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setPw2(String pw2) {
        this.pw2 = pw2;
    }

}
