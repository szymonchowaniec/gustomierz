package com.example.gifsproject.model;

public class Member {

    private String name;
    private String Lastname;
    private String email;

    public Member() {
    }

    public Member(String name, String lastname, String email) {
        this.name = name;
        Lastname = lastname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
