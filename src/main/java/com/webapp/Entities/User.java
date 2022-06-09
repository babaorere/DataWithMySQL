package com.webapp.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;

    public User() {
        this(null, null);
    }

    public User(final String inName, final String inEmail) {
        this.id = null;
        this.name = inName;
        this.email = inEmail;
    }

    public User(final Integer inId, final String inName, final String inEmail) {
        this.id = inId;
        this.name = inName;
        this.email = inEmail;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }
}