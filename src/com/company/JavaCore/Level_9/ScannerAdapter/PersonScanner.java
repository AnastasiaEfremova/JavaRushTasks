package com.company.JavaCore.Level_9.ScannerAdapter;

import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
