package com.itcast.test;

public class Test10 {
    public static void main(String[] args) {
        String[] arr = {"12ab", "java", "45Cd", "Server78"};
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            boolean b = Character.isDigit(s.charAt(0)) || Character.isDigit(s.charAt(s.length()-1));
            if (b) {
                arr[i] = s.toUpperCase();
                System.out.println(arr[i]);
            }
        }
    }
}
