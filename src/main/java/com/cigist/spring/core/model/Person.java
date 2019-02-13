package com.cigist.spring.core.model;

import com.cigist.spring.core.interfaces.PersonInterface;

/**
 * Created by cigist on 13/02/19.
 */
public class Person implements PersonInterface {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void walking() {
        System.out.println(getName() + " want Walking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " want Eating");
    }
}
