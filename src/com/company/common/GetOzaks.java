package com.company.common;

import com.company.models.OzakModel;
import com.company.read_files.IConstant;
import com.company.read_files.ReadTextFile;
import com.company.read_files.Urls;

import java.util.ArrayList;

public class GetOzaks {

    public ArrayList<OzakModel> getAllOzak() {
        ArrayList<OzakModel> list;
        list = getOt();
        list.addAll(getSifat());
        list.addAll(getSon());
        list.addAll(getFel());
        list.addAll(getOlmosh());
        list.addAll(getRavish());

        return list;
    }

    private ArrayList<OzakModel> getOt() {
        String aaa = new ReadTextFile().readFile(Urls.OT);
        return ajratishOzak(aaa, IConstant.OT);
    }

    private ArrayList<OzakModel> getSifat() {
        String aaa = new ReadTextFile().readFile(Urls.SIFAT);
        return ajratishOzak(aaa, IConstant.SIFAT);
    }

    private ArrayList<OzakModel> getSon() {
        String aaa = new ReadTextFile().readFile(Urls.SON);
        return ajratishOzak(aaa, IConstant.SON);
    }

    private ArrayList<OzakModel> getFel() {
        String aaa = new ReadTextFile().readFile(Urls.FEL);
        return ajratishOzak(aaa, IConstant.FEL);
    }

    private ArrayList<OzakModel> getOlmosh() {
        String aaa = new ReadTextFile().readFile(Urls.OLMOSH);
        return ajratishOzak(aaa, IConstant.OLMOSH);
    }

    private ArrayList<OzakModel> getRavish() {
        String aaa = new ReadTextFile().readFile(Urls.RAVISH);
        return ajratishOzak(aaa, IConstant.RAVISH);
    }

    private ArrayList<OzakModel> ajratishOzak(String aaa, int type) {
        ArrayList<OzakModel> list = new ArrayList<>();
        String[] aa = aaa.split("\n");
        for (String s : aa) {
            if (!s.equals(""))
                list.add(new OzakModel(s, type));
        }
        return list;
    }
}
