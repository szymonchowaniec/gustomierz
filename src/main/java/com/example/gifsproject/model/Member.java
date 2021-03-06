package com.example.gifsproject.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.security.acl.LastOwnerException;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String Lastname;
    private String email;

    private String answer;

    public Member() {
    }

    public Member(String name, String lastname, String email) {
        this.name = name;
        Lastname = lastname;
        this.email = email;

    }
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", email='" + email + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
