package _02_Generics_LAB._02_Generic_Array_Creator;

public class Main {
    public static void main(String[] args) {
        Object[] strings = ArrayCreator.create(10, "none");
        Integer[] integers = ArrayCreator.create(Integer.class, 5, 1);
        System.out.println(integers.length);
    }
}
