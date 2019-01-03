package com.itcast.test;

public class Customer {
    private String name;
    private String id;
    private double salary;

    public Customer() {
    }

    public Customer(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println(name + " " + id + " " + salary);
    }
}
