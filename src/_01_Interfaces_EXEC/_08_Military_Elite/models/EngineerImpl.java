package _01_Interfaces_EXEC._08_Military_Elite.models;

import _01_Interfaces_EXEC._08_Military_Elite.interfaces.Engineer;
import _01_Interfaces_EXEC._08_Military_Elite.interfaces.Repair;

import java.util.ArrayList;
import java.util.Collection;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Collection<Repair> repairs;

    public EngineerImpl(int id, String name, String lastName, double salary, String corps) {
        super(id, name, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("Repairs:\n");

        for (Repair repair : this.getRepairs()) {
            builder.append("  " + repair.toString()).append("\n");
        }

        return builder.toString().trim();
    }
}
