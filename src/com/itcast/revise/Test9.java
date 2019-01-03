package com.itcast.revise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Python");
        list.add("PHP");
        list.add("Java");
        list.add("html5");
        list.add("C++");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()>4)
                list.set(i, "?");
        }
        try {
            listToFile( list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listToFile(List<String> list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
