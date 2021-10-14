package com.company.common;

import com.company.models.Qushimcha;

import java.util.ArrayList;

public class SplitQushimcha {
    private String text;
    private ArrayList<Qushimcha> allList;
    private ArrayList<Qushimcha> list;

    public SplitQushimcha(String text) {
        this.text = text;
        allList = Qushimcha.getAllQushimcha();
        list = new ArrayList<>();
        splitQushimcha();
    }

    private void splitQushimcha() {
        for (int i = 0; i < allList.size(); i++) {
            if (text.startsWith(allList.get(i).getText())) {
                splitWord(allList.get(i));
                break;
            }
        }
    }

    private void splitWord(Qushimcha qushimcha) {
        list.add(qushimcha);
        if (!text.equals(qushimcha.getText())) {
            int l1 = qushimcha.getText().length();
            text = text.substring(l1);
            splitQushimcha();
        }
    }

    public ArrayList<Qushimcha> getList() {
        return list;
    }
}
