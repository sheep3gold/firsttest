package com.itcast.revise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.write("Java\r\n");
        fw.write("PHP\r\n");
        fw.write("IOS\r\n");
        fw.write("Python\r\n");
        fw.flush();
        fw.close();
    }
}
