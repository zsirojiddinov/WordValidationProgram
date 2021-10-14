package com.company.common;

import com.company.models.OzakModel;
import com.company.models.WordModel;

import java.util.ArrayList;

public class Controller {
    private String allText;

    public Controller(String txt) {
        allText = txt;
    }

    public ArrayList<WordModel> getWordinformations() {
        TextSplit textSplit = new TextSplit(allText);
        GetOzaks getOzaks = new GetOzaks();

        ArrayList<String> list = textSplit.getWordList();
    /*    for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        ArrayList<OzakModel> ozaks = getOzaks.getAllOzak();

        return getWordWithChar(list, ozaks);
    }

    private static ArrayList<WordModel> getWordWithChar(ArrayList<String> list, ArrayList<OzakModel> ozaks) {
        ArrayList<WordModel> wordList = new ArrayList<>();
        for (String word : list) {
            for (OzakModel ozak : ozaks) {
                int code = word.indexOf(ozak.getName());
                if (code != -1) {
                    wordList.add(changeType(word, ozak));
                    break;
                }
            }
        }
        return wordList;
    }

    private static WordModel changeType(String word, OzakModel ozak) {
        int index = word.indexOf(ozak.getName());
        String old;
        String orqa;
        if (index == 0) {
            old = "";
        } else {
            old = word.substring(0, index);
        }
        int len2 = ozak.getName().length();
        orqa = word.substring(index + len2);

        ;

        return new WordModel(ozak.getId(), old, new SplitQushimcha(old).getList(), orqa, new SplitQushimcha(orqa).getList(), ozak.getName(), word);
    }
}
