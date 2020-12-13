package com.naigoapps.expenses.model;

import javax.persistence.Entity;

@Entity
public class Contributor extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
