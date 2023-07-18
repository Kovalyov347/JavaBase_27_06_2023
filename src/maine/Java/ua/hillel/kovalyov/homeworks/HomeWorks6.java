package ua.hillel.kovalyov.homeworks;

import java.util.Scanner;

public class HomeWorks6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2, a3, a4, a5 = 0;
        int b1, b2, b3, b4, b5 = 0;

        System.out.println("First team: ");
        String aTeam = scanner.nextLine();
        System.out.printf("Team member #1 of %s killed: ", aTeam);
        a1 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Team member #2 of %s killed: ", aTeam);
        a2 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Team member #3 of %s killed: ", aTeam);
        a3 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Team member #4 of %s killed: ", aTeam);
        a4 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Team member #5 of %s killed: ", aTeam);
        a5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Second team: ");
        String bTeam = scanner.nextLine();
        System.out.printf("Team member #1 of %s killed: ", bTeam);
        b1 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Team member #2 of %s killed: ", bTeam);
        b2 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Team member #3 of %s killed: ", bTeam);
        b3 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Team member #4 of %s killed: ", bTeam);
        b4 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Team member #5 of %s killed: ", bTeam);
        b5 = scanner.nextInt();
        scanner.nextLine();
        double avgScoreA = ((double) (a1 + a2 + a3 + a4 + a5)) / 5;
        double avgScoreB = ((double) (b1 + b2 + b3 + b4 + b5)) / 5;

        System.out.printf("Total score of team %s = %f\n" +
                        "Total score of team %s = %f\n",
                aTeam, avgScoreA, bTeam, avgScoreB);
        if (avgScoreA > avgScoreB) {
            System.out.printf("Team %s win :) \n", aTeam);
        } else if (avgScoreA < avgScoreB) {
            System.out.printf("Team %s win :) \n", bTeam);
        } else {
            System.out.println("Draw win :)))");
        }
    }
}

