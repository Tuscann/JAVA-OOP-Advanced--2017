package _01_Interfaces_EXEC._05_Border_Control;



public class Citizen implements Identificatable {
    private String model;
    private String id;

    Citizen(String model, String id) {
        this.setModel(model);
        this.setId(id);
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setId(String id) {
        this.id = id;
    }
    @Override
    public String getID() {
        return this.id;
    }
}
