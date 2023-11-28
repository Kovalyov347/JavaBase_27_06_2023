package ua.hillel.kovalyov.lessons;

public class Random {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            int randomNumber = (int) (Math.random() * 101);
            if (1 == 0) {
                System.out.println("BOOM");

            }
            i--;
        }
    }
}