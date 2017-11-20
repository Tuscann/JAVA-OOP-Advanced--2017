package _01_Interfaces_EXEC._08_Military_Elite.models;


import _01_Interfaces_EXEC._08_Military_Elite.interfaces.Commando;
import _01_Interfaces_EXEC._08_Military_Elite.interfaces.Mission;

import java.util.ArrayList;
import java.util.Collection;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Collection<Mission> missions;

    public CommandoImpl(int id, String name, String lastName, double salary, String corps) {
        super(id, name, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public Collection<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("Missions:\n");

        for (Mission mission : this.getMissions()) {
            builder.append("  " + mission).append("\n");
        }

        return builder.toString().trim();
    }
}
