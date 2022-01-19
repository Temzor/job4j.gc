package ru.liga;

abstract class WriterTest {
    public static void writer() {
        System.out.println("Writing...");
    }
}

class Author extends WriterTest {
    public static void writer() {
        System.out.println("Writing book");
    }
}

class Programmer extends WriterTest {
    public static void writer() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        WriterTest writerTest = new Programmer();
        writerTest.writer();
    }
}
