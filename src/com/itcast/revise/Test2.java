package com.itcast.revise;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("铁扇公主");
        list.remove(2);
        System.out.println(list);
    }
}
