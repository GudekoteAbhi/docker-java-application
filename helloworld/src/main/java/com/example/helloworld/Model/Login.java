package com.example.helloworld.Model;

import javax.validation.constraints.Size;

public class Login {
    @Size(min=10, message = "min size is 10")
    private String contact;
    private String password;

    public Login(){}

    public Login(String contact, String password) {
        this.contact = contact;
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "contact='" + contact + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
