package ua.hillel.kovalyov.homeworks;

public class HomeWork13 {

    private String bun;

    private String meat;

    private String cheese;

    private String lettuce;

    private String mayonnaise;

    // конструктор для обычного бургера

    public void Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise) {

        this.bun = bun;

        this.meat = meat;

        this.cheese = cheese;

        this.lettuce = lettuce;

        this.mayonnaise = mayonnaise;

        System.out.println("Состав обычного бургера: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise);

    }

    // конструктор для диетического бургера

    public void Burger(String bun, String meat, String cheese, String lettuce) {

        this.bun = bun;

        this.meat = meat;

        this.cheese = cheese;

        this.lettuce = lettuce;

        this.mayonnaise = "";

        System.out.println("Состав диетического бургера: " + bun + ", " + meat + ", " + cheese + ", " + lettuce);

    }

    // конструктор для бургера с двойным мясом

    public void Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise, int meatCount) {

        this.bun = bun;

        this.meat = meat;

        this.cheese = cheese;

        this.lettuce = lettuce;

        this.mayonnaise = mayonnaise;

        if (meatCount == 2) {

            System.out.println("Состав бургера с двойным мясом: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise);

        } else {

            System.out.println("Ошибка: бургер с двойным мясом может содержать только 2 куска мяса.");

        }

    }

}

