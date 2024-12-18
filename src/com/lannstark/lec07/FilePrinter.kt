package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.nio.Buffer

// kotlin은 Checked-Exception  / UnChecked-Exception 구분하지 않고 모두 UnChecked-Exception으로 처리
class FilePrinter {
    fun readFile() {
        val currentFile = File(".");
        val file = File(currentFile.absolutePath + "/a.txt");
        val reader = BufferedReader(FileReader(file));
        println(reader.readLine());
        reader.close();
    }

    // java의 try with resources를 kotlin으로 옮김
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine());
        }
    }
}