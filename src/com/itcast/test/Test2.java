package com.itcast.test;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 6, 7};
        String[] arr2 = {"方块", "梅花", "红桃", "黑桃"};
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (i1==arr2.length-1)
                    System.out.println(arr2[i1] + arr1[i]);
                else
                    System.out.print(arr2[i1] + arr1[i]+",");
            }
//            System.out.println();
        }
    }
}
