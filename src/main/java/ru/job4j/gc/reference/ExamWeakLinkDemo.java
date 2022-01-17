package ru.job4j.gc.reference;

import java.lang.ref.WeakReference;

public class ExamWeakLinkDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        WeakReference<Object> weakobj
                = new WeakReference<Object>(obj);
        System.out.println(
                "-> Retrieving object from weak reference using get ()");
        System.out.println(weakobj.get());
        System.out.println(
                "-> Is it possible to queue object using enqueue ()");
        System.out.println(weakobj.enqueue());
        System.out.println(
                "-> Checking if reference is queued using isEnqueued ()");
        System.out.println(weakobj.isEnqueued());
    }
}
class X {
    void show() {
        System.out.println("show () from X invoked..");
    }
}
