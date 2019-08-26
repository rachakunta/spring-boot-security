package com.rana.spring.models;

import java.util.Collection;

public class Hobbies {
    private Collection<String> hobbies;

    public Collection<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Collection<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Hobbies{" +
                "hobbies=" + hobbies +
                '}';
    }
}
