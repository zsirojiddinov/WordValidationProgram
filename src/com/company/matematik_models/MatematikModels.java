package com.company.matematik_models;

import java.util.ArrayList;

public class MatematikModels {
    public static String getOtAffiksatsiya() {
        String txt =
                "( $[i,1/h1](C[i]) *↓$[j,1/33]C(A1[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V \n" +
                        "( ↓C(A1) *$[i,1/h1](C[i]) *↓$[j,1/33]C(A1[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V \n" +
                        "( $[i,1/h3](G[i]) *$[j,1/47]C(A1[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V \n" +
                        "( $[i,1/h2](P[i]) *$[j,1/6]C(A1[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V \n" +
                        "( $[i,1/h4](F[i]) *$[j,1/6]C(A1[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V \n" +
                        "( $[i,1/h4](M[i]) *$[j,1/6]C(A1[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V \n" +
                        "( $[i,1/h4](N[i]) *$[j,1/6]C(A1[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) )";
        txt = txt.replace("\n", "");
        txt = txt.replace(" ", "");
        return txt;
    }

    public static String getOtKOmpozitsiya() {
        String txt =
                "( $[i,1/h1](C[i]) *↓$[j,1/h1](C[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V\n" +
                        "( $[i,1/h2](P[i]) *↓$[j,1/h1](C[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V\n" +
                        "( $[i,1/h4](F[i]) *↓$[j,1/h1](C[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V\n" +
                        "( $[i,1/h1](F[i]) *↓$[j,1/h3](G[j]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V\n" +
                        "( $[i,1/h7](N[i]) *$[j,1/h8](P3[j]) *↓$[k,1/h9](X6[k]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) ) V\n" +
                        "( $[i,1/h1](C[i]) *$[j,1/h8](P3[j]) *↓$[k,1/h9](X6[k]) *↓X *↓$[s,1/10](X2[s]) *↓$[t,1/5](X3[t]) *↓$[r,1/6]U(A1[r]) )";

        txt = txt.replace("\n", "");
        txt = txt.replace(" ", "");
        return txt;
    }

    public static ArrayList<String> otAlgoritms() {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add("$[i,1/h1](C[i]) *$[i,1/33]C(A1[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("C(A1) *$[i,1/h1](C[i]) *$[i,1/33]C(A1[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h3](G[i]) *$[i,1/47]C(A1[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h2](P[i]) *$[i,1/6]C(A1[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h4](F[i]) *$[i,1/6]C(A1[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h4](M[i]) *$[i,1/6]C(A1[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h4](N[i]) *$[i,1/6]C(A1[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");

        list.add("$[i,1/h1](C[i]) *$[i,1/h1](C[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h2](P[i]) *$[i,1/h1](C[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h4](F[i]) *$[i,1/h1](C[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h1](F[i]) *$[i,1/h3](G[i]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i])");
        list.add("$[i,1/h7](N[i]) *$[i,1/h8](P3[i]) *$[k,1/h9](X6[k]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i]) ");
        list.add("$[i,1/h1](C[i]) *$[i,1/h8](P3[i]) *$[k,1/h9](X6[k]) *X *$[i,1/10](X2[i]) *$[i,1/5](X3[i]) *$[i,1/6]U(A1[i]) ");

        for (String s : list) {
            list2.add(s.replace(" ", ""));
        }

        return list2;
    }
}
