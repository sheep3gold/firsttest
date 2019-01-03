package com.itcast.test;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        try {
            method(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method(String s) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        bw.write(s);
        bw.newLine();
        bw.close();
    }

    public static void method1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        Random random = new Random();
        String line;
        String s = "";
        if ((line = br.readLine()) == null) {
            System.out.println("没有字符串！");
            return;
        }
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(line.length());
            s += line.charAt(index);
        }
        System.out.println(s);
    }
}
