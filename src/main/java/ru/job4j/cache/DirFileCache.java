package ru.job4j.cache;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class DirFileCache extends AbstractCache<String, String> {

    private final String cachingDir;

    public DirFileCache(String cachingDir) {
        this.cachingDir = cachingDir;
    }

    @Override
    protected String load(String key) {
        System.out.println("Start load file in cache.");
        String result = null;
        File file = new File(cachingDir + "\\\\" + key);
        if (!file.exists()) {
            throw new IllegalArgumentException(
                    String.format("File \"%s\" is not found", key)
            );
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException(
                    String.format("Incorrect file - \"%s\"", key)
            );
        }
        try {
            result = Files.readString(Paths.get(cachingDir, key), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}