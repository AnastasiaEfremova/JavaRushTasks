package com.company.JavaCore.Level_4.Bridge;

public interface Bridge {
    default int getCarsCount() {
        return 500;
    }
}
