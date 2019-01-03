package com.itcast.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        //写入
        try {
            method();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //读取
        ArrayList<String> list = new ArrayList<>();
        try {
            method1(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //将含有"ld"的元素变为"itcast",最后输出集合中修改后的元素
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("ld")) {
                list.set(i, "itcast");
            }
        }
        list.forEach(s -> System.out.println(s));
    }

    public static void method1(ArrayList<String> list) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
    }

    public static void method() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        bw.write("Helld345");
        bw.newLine();
        bw.write("World123");
        bw.newLine();
        bw.write("Java");
        bw.newLine();
        bw.close();
    }
}
