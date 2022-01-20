package ru.job4j.cache;

import java.util.Scanner;

public class Emulator1 {
    public static void main(String[] args) {
        AbstractCache<String, String> cache = null;
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while (run) {
            try {
                if (cache == null) {
                    System.out.println("Enter the directory");
                    cache = new DirFileCache(in.nextLine());
                    continue;
                }
                System.out.println("Enter file name or \"Q\" for quit.");
                String file = in.nextLine();
                if ("Q".equals(file)) {
                    run = false;
                    continue;
                }
                System.out.println(cache.get(file));
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}