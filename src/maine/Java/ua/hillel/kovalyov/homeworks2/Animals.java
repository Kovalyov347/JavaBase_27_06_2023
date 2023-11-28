package ua.hillel.kovalyov.homeworks2;

public abstract class Animals {
    private static int count;

    public Animals() {
        count++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getCount() {
        return count;
    }
}

// Dog

class Dog extends Animals {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Собака пробежала " + distance + " м");
        } else {
            System.out.println("Собака не может пробежать такое расстояние");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println("Собака проплыла " + distance + " м");
        } else {
            System.out.println("Собака не может проплыть такое расстояние");
        }
    }
}

// Cat

class Cat extends Animals {
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0;

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кот пробежал " + distance + " м");
        } else {
            System.out.println("Кот не может пробежать такое расстояние");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
