package ua.hillel.kovalyov.homeworks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int M, N;
        do {
            System.out.print("Enter please (M > 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Enter please only integers.");
                scanner.next();
            }
            M = scanner.nextInt();
        } while (M <= 0);

        do {
            System.out.print("Enter please (N > 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Enter please only integers.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("Enter please element of matrix [%d][%d]:", i, j);
                while (!scanner.hasNextInt()) {
                    System.out.println("Enter please only integers.");
                    scanner.next();
                }
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transposedMatrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transposed matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
