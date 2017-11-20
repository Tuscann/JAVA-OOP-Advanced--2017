package _01_Interfaces_EXEC._10_MooD_3;

public class Demon extends GameObject {
    private double energy;

    protected Demon(String username, double energy, int level) {
        super(username, level);
        this.setEnergy(energy);
    }

    private void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    protected String generateHashPassword() {
        return String.valueOf(super.getName().length() * 217);
    }
}
