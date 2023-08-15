package ua.hillel.kovalyov.homeworks;

public class FitnessTracker {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phone;
    private int weight;
    private int pressure;
    private int dailySteps;
    private int age;

    public FitnessTracker(String firstName, int birthDay, int birthMonth, int birthYear, String email, String phone) {
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.age = 2020 - birthYear; // Assuming current year is 2020
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Pressure: " + pressure);
        System.out.println("Daily Steps: " + dailySteps);
        System.out.println("-----------------------------");
    }
}
