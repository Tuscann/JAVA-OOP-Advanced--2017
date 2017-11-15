package _01_Interfaces_EXEC._07_Food_Shortage;

public class Rebel implements Buyer {

    private String name;
    private int age;
    private String group;
    private int food;

    Rebel(String name, int age, String group) {
        this.setName(name);
        this.setAge(age);
        this.setGroup(group);
        this.food = 0;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setGroup(String group) {
        this.group = group;
    }


    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
