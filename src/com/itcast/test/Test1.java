package com.itcast.test;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(91) + 10;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 70) {
                arr[i] = 5;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
