package ua.hillel.kovalyov.homeworks;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число");
        int range = 10;
        int number = (int) (Math.random() * range);
        int tryCounter = 0;
        int maxCountOfTries = 1;
        while (tryCounter < maxCountOfTries) {
            System.out.println("Угадайте число от 0 до " + range);
            int inputNumber = 0;
            if (scanner.hasNextInt()) {
                inputNumber = scanner.nextInt();
            } else {
                System.out.println("Введите число.");
                scanner.nextLine();
                continue;
            }

            if (inputNumber == number) {
                System.out.println("Вы угадали.");
                return;
            } else if (inputNumber > number) {
                tryCounter++;
                System.out.println("Загаданное число меньше");
            } else {
                tryCounter++;
                System.out.println("Загаданное число больше");
            }
        }
        System.out.println("Вы исчерпали попытки");
        scanner.close();
    }
}
