package ua.hillel.kovalyov.homeworks;

public class HomeWorks4 {
    public static void main(String[] args) {
        double  height = 3.5;
        double  width = 4.2;
        double  depth = 6.3;
        double  volume = height * width * depth;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        double length = (height + width + depth) * 4;
        System.out.println("Довжина всіх сторін паралелепіпеда = " + length);
    }
}
