package com.itcast.revise;

import java.util.ArrayList;
import java.util.Iterator;

public class EmplTest {
    public static void main(String[] args) {
        Empl e1 = new Empl(100);
        Empl e2 = new Empl(300);
        Empl e3 = new Empl(567);

        ArrayList<Empl> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Iterator<Empl> it = list.iterator();
        while (it.hasNext()) {
            Empl e = it.next();
            if (e.getSalary()<=300)
                it.remove();
            else
                e.setSalary(e.getSalary() + 100);
        }
        System.out.println(list);
    }
}
