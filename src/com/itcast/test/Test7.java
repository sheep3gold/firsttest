package com.itcast.test;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("个数为：" + count);
    }
}
