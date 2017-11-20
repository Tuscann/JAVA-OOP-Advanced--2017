package _01_Interfaces_EXEC._08_Military_Elite.models;


import _01_Interfaces_EXEC._08_Military_Elite.interfaces.LeutenantGeneral;
import _01_Interfaces_EXEC._08_Military_Elite.interfaces.Private;

import java.util.ArrayList;
import java.util.Collection;

public class LeutenantGeneralImp extends PrivateImpl implements LeutenantGeneral {
    private Collection<Private> privates;

    public LeutenantGeneralImp(int id, String name, String lastName, double salary) {
        super(id, name, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public Collection<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public void addPrivate(Private privateSoldier) {
        this.privates.add(privateSoldier);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("\nPrivates:\n");

        for (Private aPrivate : this.getPrivates()) {
            builder.append(String.format("  %s\n", aPrivate.toString()));
        }

        return builder.toString().trim();
    }
}
