package com.company.common;

import com.company.models.Qushimcha;

import java.util.ArrayList;

public class DataBaseName {
    private int id;
    private String firstFunc;
    private String secondFunc;
    private int lenght;

    public DataBaseName(int id, String firstFunc, String secondFunc, int lenght) {
        this.id = id;
        this.firstFunc = firstFunc;
        this.secondFunc = secondFunc;
        this.lenght = lenght;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstFunc() {
        return firstFunc;
    }

    public void setFirstFunc(String firstFunc) {
        this.firstFunc = firstFunc;
    }

    public String getSecondFunc() {
        return secondFunc;
    }

    public void setSecondFunc(String secondFunc) {
        this.secondFunc = secondFunc;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public static ArrayList<DataBaseName> getList() {
        ArrayList<DataBaseName> list = new ArrayList<>();
        list.add(new DataBaseName(0, "C", "A1", 33));//44
        list.add(new DataBaseName(1, "C", "A1", 46));//45
        list.add(new DataBaseName(2, "C", "AG", 6));//46
        list.add(new DataBaseName(2, "C", "A4", 6));//46
        list.add(new DataBaseName(3, "C", "ADS", 75));//47
        list.add(new DataBaseName(4, "P", "A1", 8));///48
        list.add(new DataBaseName(5, "P", "P1", 5));///49
        list.add(new DataBaseName(6, "P", "P2", 4));///50
        list.add(new DataBaseName(7, "G", "A", 24));///51
        list.add(new DataBaseName(8, "G", "O", 25));///52
        list.add(new DataBaseName(9, "G", "U1", 3));///53
        list.add(new DataBaseName(10, "G", "N1", 30));///54
        list.add(new DataBaseName(11, "G", "A3", 31));///55
        list.add(new DataBaseName(12, "G", "U2", 23));///56
        list.add(new DataBaseName(13, "N", "A4", 20));///57
        list.add(new DataBaseName(14, "M", "A4", 10));///58
        list.add(new DataBaseName(15, "M", "M1", 6));///59
        list.add(new DataBaseName(15, "M", "M2", 6));///59
        list.add(new DataBaseName(16, "M", "M3", 7));///60
        list.add(new DataBaseName(17, "M", "M3A", 10));///61
        list.add(new DataBaseName(18, "M", "M4", 10));///62
        list.add(new DataBaseName(19, "M", "M9", 4));///63
        list.add(new DataBaseName(20, "M", "M4A", 9));///64
        list.add(new DataBaseName(21, "M", "M5", 10));///65
        list.add(new DataBaseName(22, "M", "M6", 8));///66
        list.add(new DataBaseName(23, "M", "M7", 8));///67
        list.add(new DataBaseName(24, "", "X3", 5));///68
        list.add(new DataBaseName(25, "", "X2", 5));///69
        list.add(new DataBaseName(26, "", "X", 5));///70
        list.add(new DataBaseName(27, "", "U", 16));///71
        list.add(new DataBaseName(28, "", "U6", 9));///72

        return setLenght(list);
    }

    private static ArrayList<DataBaseName> setLenght(ArrayList<DataBaseName> list) {
        ArrayList<DataBaseName> arrayList = new ArrayList<>();
        ArrayList<Qushimcha> qushimchalar = Qushimcha.getAllQushimcha();
        for (DataBaseName dataBaseName : list) {
            int count = 0;
            for (Qushimcha qushimcha : qushimchalar) {
                if (qushimcha.getWeight() == dataBaseName.getId()) {
                    count++;
                }
            }
            arrayList.add(new DataBaseName(dataBaseName.getId(), dataBaseName.getFirstFunc(), dataBaseName.getSecondFunc(), count));
            //      list.get(i).setLenght(count);
        }

        return arrayList;
    }
}
