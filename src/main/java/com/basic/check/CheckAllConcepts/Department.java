package com.basic.check.CheckAllConcepts;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
