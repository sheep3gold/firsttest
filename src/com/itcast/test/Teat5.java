package com.itcast.test;

import java.util.Random;

public class Teat5 {
    public static void main(String[] args) {
//        method1();
//        method2();
        method3();
    }

    public static void method3() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(900) + 100;
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * @param 
     * @methodReturn 
     * @desc 求1~100以内(包含1和100)能被4整除但是不能被6整除的数的和，并将求出的和打印到控制台上
     **/
    public static void method2() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0 && i % 6 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    /**
     * @param
     * @methodReturn
     * @desc 遍历1~100(包含1和100)之间的数字，求出能同时被3，5整除的数的和，并将求出的和打印到控制台上
     **/
    public static void method1() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
