package controller;

import common.Library;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWord {

    Scanner in = new Scanner(System.in);

    public int countWordInFile(String fileSource, String word) throws IOException {
        try {
            FileReader fr = new FileReader(fileSource);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
                line = br.readLine();
            }
            br.close();
            return count;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public void countWord() throws IOException {
        System.out.print("Enter Path: ");
        String path = in.nextLine();
        System.out.print("Enter Word: ");
        String word = in.nextLine();
        int count = countWordInFile(path, word);
        System.out.println("Count: " + count);
    }

    public void getFileNameContainsWordInDirectory() throws IOException {
        System.out.print("Enter Path: ");
        String path = in.nextLine();
        System.out.print("Enter Word: ");
        String word = in.nextLine();
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                if (countWordInFile(file.getAbsolutePath(), word) != 0) {
                    System.out.println("file name: " + file.getName());
                }
            }
        }
    }

    public void wordProgram() throws IOException {
        Library lib = new Library();
        while (true) {
            System.out.println("1. Count Word In File");
            System.out.println("2. Find File By Word");
            System.out.println("3. Exit");
            int choice = lib.checkInputLimit(1, 3);
            switch (choice) {
                case 1:
                    countWord();
                    break;
                case 2:
                    getFileNameContainsWordInDirectory();
                    break;
                case 3:
                    return;
            }
        }
    }
}
