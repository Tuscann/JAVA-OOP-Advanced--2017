package _01_Interfaces_LAB._05_Say_Hello_Extented;

public abstract class BasePerson implements Person {

    private String name;
    protected BasePerson(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }


}
