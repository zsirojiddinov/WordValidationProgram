package com.company.controller;

public class KrilLotin {
    public String changeLotinWord(String word) {
        String kril = "";
        word = word.replace("а", "a");
        word = word.replace("б", "b");
        word = word.replace("в", "v");
        word = word.replace("г", "g");
        word = word.replace("д", "d");
        word = word.replace("е", "e");
        word = word.replace("ё", "yo");
        word = word.replace("ж", "j");
        word = word.replace("з", "z");
        word = word.replace("и", "i");
        word = word.replace("й", "y");
        word = word.replace("к", "k");
        word = word.replace("л", "l");
        word = word.replace("м", "m");
        word = word.replace("н", "n");
        word = word.replace("о", "o");
        word = word.replace("п", "p");
        word = word.replace("р", "r");
        word = word.replace("с", "s");
        word = word.replace("т", "t");
        word = word.replace("у", "u");
        word = word.replace("ф", "f");
        word = word.replace("х", "x");
        word = word.replace("ч", "ch");
        word = word.replace("ц", "ts");
        word = word.replace("ш", "sh");
        word = word.replace("щ", "sh");
        word = word.replace("ъ", "'");
        word = word.replace("ы", "i");
        word = word.replace("ь", "");
        word = word.replace("э", "e");
        word = word.replace("ю", "yu");
        word = word.replace("я", "ya");
        word = word.replace("ғ", "g'");
        word = word.replace("ў", "o'");
        word = word.replace("қ", "q");
        word = word.replace("ҳ", "h");
        return word;
    }
}
