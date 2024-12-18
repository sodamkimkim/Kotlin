package com.lannstark.lec07;

import java.io.File;
import java.io.IOException;

public class Lec07Main {
    public static void main(String[] args) throws IOException {
        JavaFilePrinter printer = new JavaFilePrinter();
        printer.readFile(new File(".").getAbsolutePath() + "/a.txt");
    }
}
