package ru.liga;

public class SwitchTest {
    public static void main(String[] args) {
        int cardVal = 18;
        switch (cardVal) {
            case 4, 5, 6, 7, 8 -> System.out.println("Hit");
            case 9, 10, 11 -> System.out.println("Double");
            case 15, 16 -> System.out.println("Surrender");
            default -> System.out.println("Stand");
        }
    }
}
