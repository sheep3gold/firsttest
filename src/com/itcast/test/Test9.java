package com.itcast.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test9 {
    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String s = "";
        String line;
        while ((line = br.readLine()) != null) {
            s += line;
        }
        int count = 0;
        char[] c = s.toCharArray();
        for (char c1 : c) {
            if (c1 == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
