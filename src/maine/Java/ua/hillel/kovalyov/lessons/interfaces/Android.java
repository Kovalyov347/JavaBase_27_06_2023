package ua.hillel.kovalyov.lessons.interfaces;

public class Android implements Smartphone,LinuxOS {
    public void call() {
        System.out.println("Я телефоную з андроїда");
    }

    public void sms() {
        System.out.println("Я відправляю повідомлення з андроїда");
    }

    public void internet() {
        System.out.println("Я з'єднуюсь з інтернетом з андроїда");
    }
    public void terminal(){
        System.out.println("Я друкую в терміналі");
    }
}
