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
        if (scanner.hasNextInt()) {
            a1 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        System.out.printf("Team member #2 of %s killed: ", aTeam);
        if (scanner.hasNextInt()) {
            a2 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        System.out.printf("Team member #3 of %s killed: ", aTeam);
        if (scanner.hasNextInt()) {
            a3 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        System.out.printf("Team member #4 of %s killed: ", aTeam);
        if (scanner.hasNextInt()) {
            a4 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        System.out.printf("Team member #5 of %s killed: ", aTeam);
        if (scanner.hasNextInt()) {
            a5 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();

        System.out.println("Second team: ");
        String bTeam = scanner.nextLine();
        System.out.printf("Team member #1 of %s killed: ", bTeam);
        if (scanner.hasNextInt()) {
            b1 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        System.out.printf("Team member #2 of %s killed: ", bTeam);
        if (scanner.hasNextInt()) {
            b2 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        System.out.printf("Team member #3 of %s killed: ", bTeam);
        if (scanner.hasNextInt()) {
            b3 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        System.out.printf("Team member #4 of %s killed: ", bTeam);
        if (scanner.hasNextInt()) {
            b4 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        System.out.printf("Team member #5 of %s killed: ", bTeam);
        if (scanner.hasNextInt()) {
            b5 = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        scanner.nextLine();
        double avgScoreA = ((double) (a1 + a2 + a3 + a4 + a5)) / 5;
        double avgScoreB = ((double) (b1 + b2 + b3 + b4 + b5)) / 5;

        System.out.printf("Total score of team %s = %f\n" +
                        "Total score of team %s = %f\n",
                aTeam, avgScoreA, bTeam, avgScoreB);
        if (avgScoreA > avgScoreB) {
            System.out.printf("Team %s win 🙂 \n", aTeam);
        } else if (avgScoreA < avgScoreB) {
            System.out.printf("Team %s win 🙂 \n", bTeam);
        } else {
            System.out.println("Draw win :)))");
        }
    }
}

