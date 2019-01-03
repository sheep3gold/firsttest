package com.itcast.revise;

import java.util.Arrays;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = randomArr();
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] randomArr() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        return arr;
    }

    public static void reverse(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[(i + 1)%arr.length];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i];
        }
    }
}
