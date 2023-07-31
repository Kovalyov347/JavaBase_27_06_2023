package ua.hillel.kovalyov.homeworks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter please (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter please (N): ");
        int N = scanner.nextInt();

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("Enter please element of matrix [%d][%d]:", i, j);
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
