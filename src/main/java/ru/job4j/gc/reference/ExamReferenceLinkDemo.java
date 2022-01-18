package ru.job4j.gc.reference;

import java.lang.ref.WeakReference;

public class ExamReferenceLinkDemo {
    public static void main(String[] args) throws InterruptedException {
        Object innerObject = new Object();
        WeakReference<Object> weakRef = new WeakReference<>(innerObject);

        System.out.println("weakRef.get(): " + weakRef.get());

        innerObject = null;

        System.out.println("\nCall System.gc().\n");
        System.gc();
        Thread.sleep(3000);

        System.out.println("weakRef.get(): " + weakRef.get());
    }
}
