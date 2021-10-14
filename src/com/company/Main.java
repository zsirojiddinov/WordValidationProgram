package com.company;

import com.company.common.*;
import com.company.controller.KrilLotin;
import com.company.matematik_models.MatematikModels;
import com.company.models.WordModel;
import com.company.read_files.IConstant;
import com.company.read_files.ReadTextFile;
import com.company.read_files.Urls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        generetaMatematikModels(Urls.LOTIN, Urls.WORD_LOTIN_MAT_MODEL);

        //  matematikModelChek(Urls.MAT_MODELS);
    }

    private static void generetaMatematikModels(String readWordsUrl, String writeGenerateMatematikModels) {
        ArrayList<String> list = getWords(readWordsUrl);
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            Controller controller = new Controller(word);
            ArrayList<WordModel> wordinformations = controller.getWordinformations();
            if (wordinformations.size() > 0) {
                String s = initModel(wordinformations.get(0));
                list2.add(s);
            }

            for (int j = 0; j < list2.size(); j++) {
                System.out.println(list2.get(j));
            }
        }
        System.out.println(list2.size());
        String s = "";
        for (int i = 0; i < list2.size(); i++) {
            s = s + list2.get(i) + "\n";
        }
        ReadTextFile file = new ReadTextFile();
        file.write(writeGenerateMatematikModels, s);
    }

    private static void matematikModelChek(String matematikUrls) {
        int count = 0;
        ArrayList<String> list = getWords(matematikUrls);
        ArrayList<String> array = MatematikModels.otAlgoritms();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < array.size(); j++) {
                String customModels = list.get(i);
                String models = array.get(j);
                boolean ok = isOk(customModels, models);
                if (ok) {
                    count++;
                    arrayList.add(customModels);
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(arrayList.size());
    }

    // $[i,1/h1](C[i]) *$[i,1/33]C(A1[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])
    //$[i,1/6]C(AG[i])*$[i,1/31]G(A3[i])

    private static boolean isOk(String customModels, String models) {
        ArrayList<String> listModel = new ArrayList<>(Arrays.asList(models.split("\\*")));
        ArrayList<String> listCustom = new ArrayList<>(Arrays.asList(customModels.split("\\*")));

        for (String custom : listCustom) {
            boolean b = false;
            for (String model : listModel) {
                if (custom.equals(model)) {
                    b = true;
                    break;
                } else {
                    if (model.startsWith("$") && custom.startsWith("$")) {
                        String modelS = subString(model);
                        String modelC = subString(custom);
                        if (modelS.equals(modelC)) {
                            b = true;
                            break;
                        }
                    }
                }
            }

            if (!b) {
                return false;
            }
        }
        return true;
    }

    private static String subString(String model) {
        for (int i = 0; i < model.length(); i++) {
            if (model.charAt(i) == ']') {
                return model.substring(i + 1);
            }
        }
        return model;
    }

    private static ArrayList<String> getWords(String urls) {
        ReadTextFile file = new ReadTextFile();
        String words = file.readFile(urls);
        String[] split = words.split("\n");
        return new ArrayList<>(Arrays.asList(split));
    }

    private static ArrayList<String> getArrayCastToWords() {
        ReadTextFile file = new ReadTextFile();
        String words = file.readFile(Urls.WORD);
        String[] split = words.split("\n");
        List<String> list = Arrays.asList(split);

        ArrayList<String> lotinWords = new ArrayList<>();
        for (String s : list) {
            lotinWords.add(new KrilLotin().changeLotinWord(s));
        }
        return lotinWords;
    }

    private static String initModel(WordModel wordModel) {
        String matModel = "";
        if (wordModel.getOldList().size() > 0) {
            for (int i = 0; i < wordModel.getOldList().size(); i++) {
                if (wordModel.getOldList().get(i).getType() == 28) {
                    matModel = matModel + "X * ";
                } else {
                    DataBaseName dataBaseName = getBase(wordModel.getOldList().get(i).getType());
                    matModel = matModel + "$[i" + i + ",1/" + dataBaseName.getLenght() + "]" + dataBaseName.getFirstFunc() + "(" + dataBaseName.getSecondFunc() + "[i" + i + "]) * ";
                }

            }
        }

        if (wordModel.getOrqalIst().size() > 0) {
            for (int i = 0; i < wordModel.getOrqalIst().size(); i++) {
                if (wordModel.getOrqalIst().get(i).getType() == 28) {
                    matModel = matModel + "X * ";
                } else {
                    DataBaseName dataBaseName = getBase(wordModel.getOrqalIst().get(i).getType());
                    matModel = matModel + "$[i" + i + ",1/" + dataBaseName.getLenght() + "]" + dataBaseName.getFirstFunc() + "(" + dataBaseName.getSecondFunc() + "[i" + i + "]) * ";
                }
            }
        }

        matModel = matModel.replace(" ", "");
        matModel = matModel.substring(0, matModel.length());
        //      System.out.println(matModel);

        return matModel;
    }

    private static DataBaseName getBase(int type) {
        ArrayList<DataBaseName> dataBase = DataBaseName.getList();
        for (int i = 0; i < dataBase.size(); i++) {
            if (type == dataBase.get(i).getId()) {
                return dataBase.get(i);
            }
        }
        return dataBase.get(0);
    }


}
