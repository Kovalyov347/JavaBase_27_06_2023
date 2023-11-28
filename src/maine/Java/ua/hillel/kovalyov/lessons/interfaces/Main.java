package ua.hillel.kovalyov.lessons.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Android android = new Android();
//        android.call();
//        android.sms();
//        android.internet();
//        android.terminal();
//
//        Iphone iphone = new Iphone();
//        iphone.call();
//        iphone.sms();
//        iphone.internet();
//        iphone.payApple(59);
        Smartphone smartphone;
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 5) {
            smartphone = new Android();
        } else {
            smartphone = new Iphone();
        }
        smartphone.call();
    }
}
