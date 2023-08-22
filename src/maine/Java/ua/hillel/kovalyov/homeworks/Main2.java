package ua.hillel.kovalyov.homeworks;

public class Main2 {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        iPhones iPhone = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.linuxOS();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.iOS();
    }
}
