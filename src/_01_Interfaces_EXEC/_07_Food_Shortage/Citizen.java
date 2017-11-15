package _01_Interfaces_EXEC._07_Food_Shortage;

public class Citizen implements Buyer {
    private String name;
    private int age;
    private String id;
    private String birthdate;
    private int food;

    public Citizen(String name, int age, String id, String birthdate) {
        this.setName(name);
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
