package _01_Interfaces_EXEC._02_Multiple_Implementation;

public class Citizen implements Birthable,Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthdate;

    Citizen(String name, int age, String id, String birthdate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthdate(birthdate);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String Birthdate() {
        return this.birthdate;
    }

    @Override
    public String id() {
        return this.id;
    }
}
