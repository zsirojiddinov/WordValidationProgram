package com.company.read_files;

public class IConstant {
    public static int OT = 1;
    public static int FEL = 2;
    public static int SIFAT = 3;
    public static int OLMOSH = 4;
    public static int RAVISH = 5;
    public static int SON = 6;
    public static int XAR_XIL_QUSHIMCHALAR = 7;

    public static String getSozturkumi(int id) {
        switch (id) {
            case 1: {
                return "OT";
            }
            case 3: {
                return "SIFAT";
            }
            case 6: {
                return "SON";
            }
            case 2: {
                return "FEL";
            }
            case 4: {
                return "OLMOSH";
            }
            case 5: {
                return "RAVISH";
            }
        }
        return "null";
    }
}
