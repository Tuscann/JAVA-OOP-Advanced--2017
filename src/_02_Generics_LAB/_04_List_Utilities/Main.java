package _02_Generics_LAB._04_List_Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();
        Collections.addAll(myList,1,2,18,2,-1);

        ListUtils la= new ListUtils();

        System.out.println(ListUtils.getMax(myList));
        System.out.println(ListUtils.getMin(myList));

    }
}
