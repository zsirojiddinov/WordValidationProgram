package com.company.models;

import com.company.read_files.ReadTextFile;
import com.company.read_files.Urls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qushimcha {

    private String text;
    private int weight;
    private int type;

    public Qushimcha(String text, int weight, int type) {
        this.text = text;
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text + "\t" + weight + "\t" + type;
    }

    public static ArrayList<Qushimcha> getAllQushimcha() {
        ArrayList<Qushimcha> list = new ArrayList<>();
        String url = Urls.ALL_QUSHIMCHA2;
        ReadTextFile readTextFile = new ReadTextFile();
        String txt = readTextFile.readFile(url);

        String[] a = txt.split("\n");
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("")) {
                continue;
            }
            list.add(getModel(a[i]));
        }

        return list;

    }

    private static ArrayList<Qushimcha> refreshList(ArrayList<Qushimcha> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                int max = list.get(j).getText().length();
                if (max < list.get(j + 1).getText().length()) {
                    String b1 = list.get(j).getText();
                    int b2 = list.get(j).getWeight();
                    int b3 = list.get(j).getType();

                    list.get(j).setText(list.get(j + 1).getText());
                    list.get(j).setWeight(list.get(j + 1).getWeight());
                    list.get(j).setType(list.get(j + 1).getType());

                    list.get(j + 1).setText(b1);
                    list.get(j + 1).setWeight(b2);
                    list.get(j + 1).setType(b3);
                }
            }
        }
        return list;

    }

    private static Qushimcha getModel(String a) {
        String[] aa = a.split(",");
        return new Qushimcha(aa[0], Integer.parseInt(aa[1]), Integer.parseInt(aa[2]));
    }
}
