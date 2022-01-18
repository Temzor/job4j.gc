package ru.job4j.cache;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

public class DirFileCache extends AbstractCache<String, String> {

    private final String cachingDir;

    public DirFileCache(String cachingDir) {
        File directory = new File(cachingDir);
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException(
                    String.format("Directory \"%s\" is not found", cachingDir)
            );
        }
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile()) {
                put(file.getName(), null);
            }

        }
        this.cachingDir = cachingDir;
    }

    @Override
    protected String load(String key) {
        StringJoiner stringJoiner = new StringJoiner(System.lineSeparator());
        File file = new File(cachingDir + "\\\\" + key);
        if (!file.exists()) {
            throw new IllegalArgumentException(
                    String.format("File \"%s\" is not found", key)
            );
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException(
                    String.format("Incorrect file  - %s", key)
            );
        }
        try ( BufferedReader reader = new BufferedReader(
                new FileReader(file, StandardCharsets.UTF_8)))
        {
            reader.lines().forEach(stringJoiner::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringJoiner.toString();
    }
}