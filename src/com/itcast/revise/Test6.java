package com.itcast.revise;

public class Test6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
