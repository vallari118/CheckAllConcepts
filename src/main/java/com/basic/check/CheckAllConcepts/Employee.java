package com.basic.check.CheckAllConcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int eid;
    private String ename;

    @Autowired // Autowired on constructor
    public Employee(Department department){
        System.out.println("Autowiring on constructor ");
        this.department = department;
    }

     //AUtowired on Properties
    private Department department;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Department getDepartment() {
        return department;
    }

     // Autowired on setter
    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void showEployeeDetails(){
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee Name : " + ename);
        department.setDeptName("Information Technology");
        System.out.println("Department : " + department.getDeptName());
    }
}
