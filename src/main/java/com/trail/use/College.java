package com.trail.use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
    private int cid;
    private String collegeName;

    @Autowired
    private Teacher teacher;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void showInfo(){
        System.out.println("College ID: "+cid);
        System.out.println("College Name: "+collegeName);
        teacher.settName("Vallari Manavi");
        System.out.println(teacher.gettName());
    }
}
