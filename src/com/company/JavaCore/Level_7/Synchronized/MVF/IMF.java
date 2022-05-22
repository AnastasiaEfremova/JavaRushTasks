package com.company.JavaCore.Level_7.Synchronized.MVF;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        synchronized (IMF.class) {
            if(imf == null) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
