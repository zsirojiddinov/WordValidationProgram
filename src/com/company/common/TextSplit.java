package com.company.common;

import java.util.ArrayList;
import java.util.Arrays;

public class TextSplit {
    private ArrayList<String> wordList;
    private ArrayList<String> sententeList;

    public TextSplit(String text) {
        sententeList = new ArrayList<>();
        wordList = new ArrayList<>();

        splitSentenses(text);
        splitWords();
    }

    private void splitWords() {
        for (String s : sententeList) {
            String[] words = s.split(" ");
            wordList.addAll(Arrays.asList(words));
        }
    }

    private void splitSentenses(String text) {
        String[] massiv = text.split("\\.");
        ArrayList<String> aaa = new ArrayList<>(Arrays.asList(massiv));
        ArrayList<String> list1 = splitChar(aaa, "\\?");
        ArrayList<String> list2 = splitChar(list1, "\\!");

        for (String s : list2) {
            sententeList.add(s.trim());
        }
    }

    private ArrayList<String> splitChar(ArrayList<String> massiv, String s) {
        ArrayList<String> list = new ArrayList<>();
        for (String value : massiv) {
            String[] aaa = value.split(s);
            list.addAll(Arrays.asList(aaa));
        }
        return list;
    }

    public ArrayList<String> getWordList() {
        return wordList;
    }

    public ArrayList<String> getSententeList() {
        return sententeList;
    }


}
