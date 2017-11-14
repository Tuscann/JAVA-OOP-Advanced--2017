package _01_Interfaces_LAB._05_Say_Hello_Extented;

public class European extends BasePerson implements Person {
    European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
