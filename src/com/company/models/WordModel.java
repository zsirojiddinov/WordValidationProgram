package com.company.models;

import com.company.read_files.IConstant;

import java.util.ArrayList;

public class WordModel {
    private int id;
    private String oldQushimcha;
    private ArrayList<Qushimcha> oldList;
    private String orqaQushimcha;
    private ArrayList<Qushimcha> orqalIst;
    private String ozak;
    private String word;

    public WordModel(int id, String oldQushimcha, ArrayList<Qushimcha> oldList, String orqaQushimcha, ArrayList<Qushimcha> orqalIst, String ozak, String word) {
        this.id = id;
        this.oldQushimcha = oldQushimcha;
        this.oldList = oldList;
        this.orqaQushimcha = orqaQushimcha;
        this.orqalIst = orqalIst;
        this.ozak = ozak;
        this.word = word;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOldQushimcha() {
        return oldQushimcha;
    }

    public void setOldQushimcha(String oldQushimcha) {
        this.oldQushimcha = oldQushimcha;
    }

    public ArrayList<Qushimcha> getOldList() {
        return oldList;
    }

    public void setOldList(ArrayList<Qushimcha> oldList) {
        this.oldList = oldList;
    }

    public String getOrqaQushimcha() {
        return orqaQushimcha;
    }

    public void setOrqaQushimcha(String orqaQushimcha) {
        this.orqaQushimcha = orqaQushimcha;
    }

    public ArrayList<Qushimcha> getOrqalIst() {
        return orqalIst;
    }

    public void setOrqalIst(ArrayList<Qushimcha> orqalIst) {
        this.orqalIst = orqalIst;
    }

    public String getOzak() {
        return ozak;
    }

    public void setOzak(String ozak) {
        this.ozak = ozak;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        String aa = "";
        String txt = IConstant.getSozturkumi(id);
        if (!oldQushimcha.equals(""))
            aa = getOld() + ozak;
        else aa = ozak;
        if (!orqaQushimcha.equals(""))
            aa = aa + getOrqa();

        aa = aa + " = " + word + "\t- " + txt;

        return aa;
    }

    private String getOrqa() {
        String s = "";
        for (int i = 0; i < orqalIst.size(); i++) {
            s = s + " - " + orqalIst.get(i).getText();
        }
        return s;
    }

    private String getOld() {
        String s = "";
        for (int i = 0; i < oldList.size(); i++) {
            s = s + oldList.get(i).getText() + " - ";
        }
        return s;
    }
}
