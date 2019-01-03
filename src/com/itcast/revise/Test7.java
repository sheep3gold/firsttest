package com.itcast.revise;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        String[] arr = {"12", "345", "6789", "1", "123", "4567"};
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (String s : arr) {
            if (s.length() % 2 == 0) {
                list1.add(s);
            }else
                list2.add(s);
        }

        System.out.print("偶数长度的字符串：[");
        for (int i = 0; i < list1.size(); i++) {
            if (i==list1.size()-1)
                System.out.println(list1.get(i) + "]");
            else
                System.out.print(list1.get(i) + ",");
        }
        System.out.print("奇数长度的字符串：[");
        for (int i = 0; i < list2.size(); i++) {
            if (i==list2.size()-1)
                System.out.print(list2.get(i) + "]");
            else
                System.out.print(list2.get(i) + ",");
        }
    }
}
