package com.student;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface StudentInt {
    public void readStudInfo() throws IOException, ClassNotFoundException;
    public int calcTotal();
    public void printStudInfo();
}
