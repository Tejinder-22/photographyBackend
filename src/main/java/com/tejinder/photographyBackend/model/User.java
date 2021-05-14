package com.tejinder.photographyBackend.model;


import javax.persistence.*;

@Entity
@Table(name = "usercontact")
public class User {

    @Id
    @Column(name= "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phoneno;

    public User()
    {

    }

    public User(String name, String email, String phoneno) {
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
