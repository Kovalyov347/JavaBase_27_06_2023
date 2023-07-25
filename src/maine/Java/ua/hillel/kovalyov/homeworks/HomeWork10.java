package ua.hillel.kovalyov.homeworks;

import java.util.Arrays;

import java.util.Random;

public class HomeWork10 {
    public static void main(String[] args) {


        int[] first = new int[7];

        int[] second = new int[7];

        Random rand = new Random();

        for (int i = 0; i < 7; i++) {

            first[i] = rand.nextInt(10);

            second[i] = rand.nextInt(10);

        }
        Arrays.sort(first);

        Arrays.sort(second);

        int matches = 0;

        for (int i = 0; i < 7; i++) {

            if (first[i] == second[i]) {

                matches++;

            }

        }
        System.out.println(Arrays.toString(first));

        System.out.println(Arrays.toString(second));

        System.out.println("Количество совпадений: " + matches);

    }

}