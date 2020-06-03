package com.trail.use;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    private String tName;

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
