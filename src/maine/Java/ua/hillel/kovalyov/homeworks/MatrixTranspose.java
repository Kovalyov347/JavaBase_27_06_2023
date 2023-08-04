package ua.hillel.kovalyov.homeworks;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions M x N
        int M, N;
        do {
            System.out.print("Enter the number of rows (M): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer.");
                scanner.next();
            }
            M = scanner.nextInt();
        } while (M <= 0);

        do {
            System.out.print("Enter the number of columns (N): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);

        // Create and fill the initial matrix
        int[][] matrix = new int[M][N];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter an integer.");
                    scanner.next();
                }
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpose the matrix
        int[][] transposedMatrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        // Output the transposed matrix
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