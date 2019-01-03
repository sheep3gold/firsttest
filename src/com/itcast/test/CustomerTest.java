package com.itcast.test;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("yx", "1", 10200);
        Customer c2 = new Customer("qq", "2", 1200);
        Customer c3 = new Customer("ww", "3", 8200);

        List<Customer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        for (Customer customer : list) {
            if (customer.getSalary() < 3000) {
                System.out.print("不会扣税");
            }
            customer.showInfo();
        }
    }
}
