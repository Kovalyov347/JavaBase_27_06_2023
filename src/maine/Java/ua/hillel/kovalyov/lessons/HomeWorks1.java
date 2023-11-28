package ua.hillel.kovalyov.lessons;

import java.util.Scanner;

public class HomeWorks1 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int a1, a2, a3, a4, a5 = 0;
        int b1, b2, b3, b4, b5 = 0;
        System.out.println("Введите название команды №1");
        String teamAName = myscanner.nextLine();
        System.out.println("Введите количество фрагов участника 1 команды №1");
        a1 = myscanner.nextInt();
        System.out.println("Введите количество фрагов участника 2 команды №1");
        a2 = myscanner.nextInt();
        System.out.println("Введите количество фрагов участника 3 команды №1");
        a3 = myscanner.nextInt();
        System.out.println("Введите количество фрагов участника 4 команды №1");
        a4 = myscanner.nextInt();
        System.out.println("Введите количество фрагов участника 5 команды №1");
        a5 = myscanner.nextInt();
        myscanner.nextLine();
        System.out.println("Введите название команды №2");
        String teamBName = myscanner.nextLine();
        System.out.println("Введите количество фрагов участника 1 команды №2");
        b1 = myscanner.nextInt();
        System.out.println("Введите количество фрагов участника 2 команды №2");
        b2 = myscanner.nextInt();
        System.out.println("Введите количество фрагов участника 3 команды №2");
        b3 = myscanner.nextInt();
        System.out.println("Введите количество фрагов участника 4 команды №2");
        b4 = myscanner.nextInt();
        System.out.println("Введите количество фрагов участника 5 команды №2");
        b5 = myscanner.nextInt();
        double avgKills1 = (double) (a1 + a2 + a3 + a4 + a5) / 5;
        double avgKills2 = (double) (b1 + b2 + b3 + b4 + b5) / 5;
        System.out.println("Среднее количество фрагов команды 1 " + avgKills1);
        System.out.println("Среднее количество фрагов команды 2 " + avgKills2);
        if (avgKills1 > avgKills2) {
            System.out.println("Выиграла команда 1");
        }
        if (avgKills1 < avgKills2) {
            System.out.println("Выиграла команда 2");

        }
        if (avgKills1 == avgKills2) {
            System.out.println("Получилась ничья");
        }
    }
}
