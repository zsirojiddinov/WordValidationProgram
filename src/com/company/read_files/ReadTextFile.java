package com.company.read_files;

import java.io.*;
import java.util.Scanner;

public class ReadTextFile {
    public String readFile(String url) {
        StringBuilder txt = new StringBuilder();
        try {
            File myObj = new File(url);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                txt.append("\n").append(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return txt.toString();
    }

    public void write(String url,String content) {
        File file = new File(url);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);

            bw.close();
        } catch (Exception e) {
            System.out.println("error write file " + e.getMessage());
        }

    }
}

