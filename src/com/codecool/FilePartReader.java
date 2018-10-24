package com.codecool;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePartReader {

    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    public FilePartReader() {
        this.filePath = "";
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) {
        if (toLine < fromLine || fromLine < 1) throw new IllegalArgumentException("Can't read backwards!");
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public String read() {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(this.filePath);
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine() + "\n");
        }
        return sb.toString();
    }

    public String readLines() {
        String text = read();
        String[] lines = text.split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i = fromLine; i <= toLine; i++) {
            sb.append(lines[i]);
            if (i != toLine) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
