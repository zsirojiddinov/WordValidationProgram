package com.company.common;

import com.company.models.Qushimcha;
import com.company.read_files.ReadTextFile;
import com.company.read_files.Urls;

import java.util.ArrayList;

public class Common {
    public void changeQushimchaType() {
        ReadTextFile read = new ReadTextFile();
        String text = read.readFile(Urls.QUSHIMCHALAR);
        String[] array = text.split("\n");
        ArrayList<String> list = new ArrayList<>();
        for (String s : array) {
            if (!s.equals("")) {
                list.add(s);
            }
        }
        ArrayList<Qushimcha> qList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String[] mas = list.get(i).split(",");
            ArrayList<String> list1 = new ArrayList<>();
            for (String ma : mas) {
                list1.add(ma.trim());
            }
            for (String s : list1) {
                qList.add(new Qushimcha(s, i, i));
            }
        }
        String txt = "";
        for (Qushimcha qushimcha : qList) {
            txt = txt + "\n" + qushimcha.toString();
        }
        read.write(Urls.ALL_QUSHIMCHA, txt);
    }
}
