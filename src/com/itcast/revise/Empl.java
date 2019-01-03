package com.itcast.revise;

public class Empl {
    private int salary;

    public Empl() {
    }

    public Empl(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "salary=" + salary +
                '}';
    }
}
