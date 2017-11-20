package _02_Generics_LAB._03_Generic_Scale;

public class Main {
    public static void main(String[] args) {
        Scale<String> scale= new Scale<>("a","a");

        System.out.println(scale.getHeavier());
    }
}
