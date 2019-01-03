package com.itcast.revise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileRead {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            fileToList(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index =(int) (Math.random() * list.size());
        System.out.print("本年度最佳语言：");
        System.out.println(list.get(index));
    }

    public static void fileToList(ArrayList<String> list) throws IOException {
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
    }
}
