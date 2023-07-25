package ua.hillel.kovalyov.homeworks;

import java.util.Random;

public class HomeWork9 {
    public static void main(String[] args) {
        Random random = new Random();
        int teamSize = 25;
        int[] team1 = new int[teamSize];
        int[] team2 = new int[teamSize];

        for (int i = 0; i < teamSize; i++) {
            team1[i] = random.nextInt(41 - 18) + 18;
            team2[i] = random.nextInt(41 - 18) + 18;

        }
        for (int i = 0; i < teamSize; i++) {
            System.out.println("Команда 1 гравець віком " + team1[i] + " номер " + i);
            System.out.println("Команда 2 гравець віком " + team2[i] + " номер " + i);
        }
        int sumAgeTeam1 = 0;
        int sumAgeTeam2 = 0;
        for (int i = 0; i < teamSize; i++) {
            sumAgeTeam1 = sumAgeTeam1 + team1[i];
            sumAgeTeam2 = sumAgeTeam2 + team2[i];
        }
        System.out.println("Середній вік команди 1 " + (sumAgeTeam1 / teamSize));
        System.out.println("Середній вік команди 2 " + (sumAgeTeam2 / teamSize));
    }
}
