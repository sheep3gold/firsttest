package com.itcast.revise;

public class Test1 {
    public static void main(String[] args) {
        byte[] bytes = {65, 66, 67, 68};
        String s = new String(bytes);
        System.out.println(s);
        char[] chars = {'a', 'b', 'c', 'd'};
        String c = new String(chars);
        System.out.println(c);

        s=s.replace('A', 'q');
        System.out.println(s);
        s = s.replaceAll("qB", "AB");
        System.out.println(s);

        String s2 = "abcd   ";
        System.out.println(s2.length());
        s2=s2.trim();
        System.out.println(s2.length());

    }
}
