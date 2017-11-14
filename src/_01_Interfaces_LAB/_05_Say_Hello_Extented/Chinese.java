package _01_Interfaces_LAB._05_Say_Hello_Extented;

public class Chinese extends BasePerson implements Person {

    Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello()
    {
        return "Djydjybydjy";
    }
}
