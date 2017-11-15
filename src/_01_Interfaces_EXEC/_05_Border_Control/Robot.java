package _01_Interfaces_EXEC._05_Border_Control;

public class Robot implements Identificatable {

    private String name;
    private String age;
    private String id;

    Robot(String name, String age, String id) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getID() {
        return this.id;
    }
}
