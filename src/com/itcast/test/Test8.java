package com.itcast.test;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        Random random = new Random();
        String s1="";
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(s.length());
            s1 += s.charAt(index);
        }
        System.out.println(s1.toUpperCase());
    }
}
