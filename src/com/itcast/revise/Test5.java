package com.itcast.revise;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长度大于等于10的字符串：");
        String s = sc.nextLine();
        if (s.length()<10)
            return;
        else{
            String s1 = s.substring(3, 10);
            char[] chars = s1.toCharArray();
            System.out.println(chars);
            int sum = 0;
            for (char aChar : chars) {
                if (Character.isLetter(aChar)) {
                    sum++;
                    System.out.println(aChar);
                }
            }
            System.out.println(sum);
        }
    }
}
