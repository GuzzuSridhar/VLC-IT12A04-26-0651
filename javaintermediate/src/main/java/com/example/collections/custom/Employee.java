package com.example.collections.custom;

public class Employee {
    private int eid;
    private String name;
    private String dept;
    private float sal;

    public Employee(int eid, String name, String dept, float sal) {
        this.eid = eid;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "ID=" + eid + ", Name=" + name + ", Department=" + dept + ", Salary=" + sal + "]";
    }

}
