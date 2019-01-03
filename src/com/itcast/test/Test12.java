package com.itcast.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test12 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        c.add("a");
        c.add("a");
        c.add("a");
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            String s =(String) objects[i];
            System.out.println(s);
        }

    }
}
