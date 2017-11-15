package _01_Interfaces_EXEC._06_Birthday_Celebrations;

public class Citizen implements Identificatable {

    private String name;
    private String age;
    private String id;
    private String birthdate;

    Citizen(String name, String age, String id, String birthdate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthdate(birthdate);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    private void setId(String id) {
        this.id = id;
    }
    @Override
    public String getBirthDate() {
        return this.birthdate;
    }
}
