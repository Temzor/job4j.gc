package ru.liga;

import java.util.ArrayList;
import java.util.List;

public class Words {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Pen");
        stringList.add("Pencil");
        stringList.add("Box");
        for (String i : stringList) {
            if (i.indexOf("P") == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
