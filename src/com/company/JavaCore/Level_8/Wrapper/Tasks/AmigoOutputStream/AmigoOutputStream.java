package com.company.JavaCore.Level_8.Wrapper.Tasks.AmigoOutputStream;

import java.io.IOException;

public interface AmigoOutputStream {

    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}
