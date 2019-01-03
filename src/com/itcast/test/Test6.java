package com.itcast.test;

import java.util.Arrays;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[(i + 1) % arr.length];
        }
        System.out.println(Arrays.toString(arr));
    }
}
