package _01_Interfaces_EXEC._08_Military_Elite.interfaces;

import java.util.Collection;

public interface Commando extends SpecialisedSoldier {
    Collection<Mission> getMissions();

    void addMission(Mission mission);
}
