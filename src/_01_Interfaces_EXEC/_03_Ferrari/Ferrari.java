package _01_Interfaces_EXEC._03_Ferrari;

class Ferrari implements Car {
    private static String FERRARI_MODEL = "488-Spider";
    private String name;

    public Ferrari(String driverName)
    {
        this.setName(driverName);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String model() {
        return null;
    }

    @Override
    public String brakes() {
        return "Brakes";
    }

    @Override
    public String gasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String driveName() {
        return this.name;
    }
    @Override
    public String toString() {
        return String.format("%s/%s!/%s/%s", FERRARI_MODEL, this.brakes(), this.gasPedal(), this.driveName());
    }

}
