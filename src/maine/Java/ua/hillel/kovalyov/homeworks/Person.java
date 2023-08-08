package ua.hillel.kovalyov.homeworks;


class Person {
    // "Позвонить гражданину + ИМЯ ФАМИЛИЯ + из города + ГОРОД можно по номеру + ТЕЛЕФОН"
    public String personInfo(String name, String surname, String city, long phoneNumber) {
        return "Позвонить гражданину " + name + " "
                + surname + " из города " + city + " можно по номеру " + phoneNumber;

    }

    public static void main(String[] args) {
        Person person = new Person();


        System.out.println(person.personInfo("Sheron", "Raze", "London", 37754634686L));

        System.out.println(person.personInfo("Janie", "Wook", "Шанхай", 12325436454L));

        System.out.println(person.personInfo("Bob", "Chep", "Нью-Йорк", 2936729462846L));
    }
}

