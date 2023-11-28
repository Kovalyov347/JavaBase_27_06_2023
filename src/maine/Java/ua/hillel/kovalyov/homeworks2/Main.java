package ua.hillel.kovalyov.homeworks2;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog();
        Cat catWhiskers = new Cat();

        dogBobik.run(150);
        dogBobik.swim(5);

        catWhiskers.run(250);
        catWhiskers.swim(2);

        System.out.println("Количество созданных животных: " + Animals.getCount());
    }
}
