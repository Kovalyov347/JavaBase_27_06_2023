package ua.hillel.kovalyov.lessons.interfaces;

public class Iphone implements Smartphone, IOS {
    public void call() {
        System.out.println("Я телефоную з айфона");
    }

    public void sms() {
        System.out.println("Я відправляю повідомлення з айфона");
    }

    public void internet() {
        System.out.println("Я з'єднуюсь з інтернетом з айфона");
    }

    public void payApple(double amount) {
        System.out.println("Я розраховуюсь сумою " + amount);
    }
}
