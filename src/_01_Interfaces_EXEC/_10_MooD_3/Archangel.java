package _01_Interfaces_EXEC._10_MooD_3;

public class Archangel extends GameObject {
    private double mana;

    public Archangel(String username, double mana, int level) {
        super(username, level);
        this.setMana(mana);
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    @Override
    protected String generateHashPassword() {
        return new StringBuilder(super.getName()).reverse().toString() + (super.getName().length()) * 21;
    }
}
