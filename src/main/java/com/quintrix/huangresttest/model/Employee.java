package com.quintrix.huangresttest.model;

public class Employee {
    String name;
    int idNumber;

    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public Employee() {
        this.name = "default";
        this.idNumber = 6969;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
