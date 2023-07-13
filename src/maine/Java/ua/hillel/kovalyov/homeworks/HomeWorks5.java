package ua.hillel.kovalyov.homeworks;

public class HomeWorks5 {
    public static void main(String[] args) {
        String dynasty = "Li";
        int warrior = 13;
        int shooter = 24;
        int rider = 46;
        int totalWarriors = 860;
        String dynasty2 = "Min";
        int warrior2 = 9;
        int shooter2 = 35;
        int rider2 = 12;
        int totalWarriors2 = (int) (totalWarriors * 1.5);

        System.out.println("total power " + dynasty + " = " + ((warrior + shooter + rider) * totalWarriors));
        System.out.println("total power " + dynasty2 + " = " + ((warrior2 + shooter2 + rider2) * totalWarriors2));

        System.out.printf("total power %s = %d %n", dynasty, ((warrior + shooter + rider) * totalWarriors));
        System.out.printf("total power %s = %d %n", dynasty2, ((warrior2 + shooter2 + rider2) * totalWarriors2));
    }
}


