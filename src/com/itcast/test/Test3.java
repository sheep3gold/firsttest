package com.itcast.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr = {"abc", "def", "def", "efg", "ck", "Ck", "qwe", "swd", "wwe", "def"};
        Collections.addAll(list, arr);
        System.out.println(list);
        list.removeIf(s -> (s.equals("def") || s.contains("c")));
//        Iterator<String> it = list.iterator();
        System.out.println(list);
    }
}
