package _01_Interfaces_EXEC._09_Collection_Hierarchy;

import java.util.ArrayList;
import java.util.List;

public class AddCollectionImpl implements AddCollection {
    private List<String> elements;

    AddCollectionImpl() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int add(String element) {
        this.elements.add(element);
        return this.elements.size() - 1;
    }
}
