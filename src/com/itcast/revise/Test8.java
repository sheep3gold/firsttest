package com.itcast.revise;

public class Test8 {
    public static void main(String[] args) {
        String s = "   ab123cd     ";
        s = s.trim();
        System.out.println(s);
        System.out.println(s.length());
        String s1 = s.substring(s.length() - 3, s.length());
        System.out.println(s1);
    }
}
