package ua.hillel.kovalyov.homeworks;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger("Булочка", "Мясо","Сир","Зелень","Майонез");
        Burger burger2 = new Burger("Булочка", "Мясо","Сир","Зелень");
        Burger burger3 = new Burger("Булочка", "Мясо","Сир","Зелень","Майонез", 2);
        Burger burger4 = new Burger("Булочка", "Мясо","Сир","Зелень","Майонез", 1);
    }
}
