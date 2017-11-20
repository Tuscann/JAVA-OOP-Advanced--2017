package _01_Interfaces_EXEC._08_Military_Elite.interfaces;


import java.util.Collection;

public interface Engineer extends SpecialisedSoldier {
    Collection<Repair> getRepairs();

    void addRepair(Repair repair);
}
