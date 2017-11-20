package _02_Generics_LAB._01_Jar_of_T;

public class Main {
    public static void main(String[] args) {
        Jar<String> jarOfStrings = new Jar<>();

        jarOfStrings.add("Pesho");
        jarOfStrings.add("Goshko");
        jarOfStrings.add("Stamatcho");

        System.out.println(jarOfStrings.remove());
    }
}
