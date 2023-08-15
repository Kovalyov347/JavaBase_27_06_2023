package ua.hillel.kovalyov.homeworks;

public class Main {public static void main(String[] args) {
    FitnessTracker user1 = new FitnessTracker("Alice", 12, 9, 1995, "alice@example.com", "111222333");
    user1.setLastName("Johnson");
    user1.setWeight(63);
    user1.setPressure(118);
    user1.setDailySteps(7500);

    FitnessTracker user2 = new FitnessTracker("Bob", 5, 7, 1988, "bob@example.com", "444555666");
    user2.setLastName("Smith");
    user2.setWeight(82);
    user2.setPressure(125);
    user2.setDailySteps(9000);

    FitnessTracker user3 = new FitnessTracker("Eve", 23, 11, 2002, "eve@example.com", "777888999");

    user1.printAccountInfo();
    user2.printAccountInfo();
    user3.printAccountInfo();

    user1.setPressure(34);
    user2.setLastName("Bobbie");
    user3.setWeight(90);


    user1.printAccountInfo();
    user2.printAccountInfo();
    user3.printAccountInfo();
}
}
