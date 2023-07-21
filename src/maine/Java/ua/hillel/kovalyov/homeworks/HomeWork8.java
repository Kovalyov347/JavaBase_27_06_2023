package ua.hillel.kovalyov.homeworks;

public class HomeWork8 {
    public static void main(String[] args){
        int maxcount = 100;
        int counter = 0;
        for (int i = 0; counter < maxcount; i++){
         if (i/10 == 4 || i/10 == 9 || i%10 == 4 || i%10 == 9 || i/100 == 4 || i/100 == 9 || i/10%10 == 4 || i/10%10 ==9){
             continue;
         }
            System.out.println(i);
         counter++;
        }
        System.out.println("counter: " + counter);
    }
}
