package _02_Generics_LAB._05_Null_Finder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, null, 2, null);

        List<Integer> IntegerNulls = ListUtils.getNullIndices(integers);
        System.out.println(IntegerNulls);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(null);
        list.add(null);
        list.add(7);
        System.out.println(ListUtils.getNullIndices(list));

    }
}
