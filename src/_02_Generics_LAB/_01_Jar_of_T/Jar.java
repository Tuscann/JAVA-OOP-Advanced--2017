package _02_Generics_LAB._01_Jar_of_T;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<E> {

    private Deque<E> elements;

    Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(E element) {
        this.elements.add(element);
    }

    public E remove() {
        return this.elements.removeLast();
    }
}
