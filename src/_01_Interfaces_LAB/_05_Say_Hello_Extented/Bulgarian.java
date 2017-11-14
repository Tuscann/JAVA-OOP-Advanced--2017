package _01_Interfaces_LAB._05_Say_Hello_Extented;

public class Bulgarian extends BasePerson implements Person {

    Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
