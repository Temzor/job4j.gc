package ru.job4j.cache;

import java.util.Scanner;

public class Emulator2 {
        public static void main(String[] args) {
            System.out.println("Please enter directory: ");
            Scanner console = new Scanner(System.in);
            String cachingDir = console.nextLine();
            AbstractCache<String, String> fileCache = new DirFileCache(cachingDir);
            String key;
            do {
                System.out.println("Enter file name or \"Q\" for quit.");
                key = console.nextLine();
                if (!key.equals("Q")) {
                    String contents = fileCache.load(key);
                    System.out.printf("This is cache contents: %n%s%n", contents);
                }
            }
            while (!key.equals("Q"));
        }
    }