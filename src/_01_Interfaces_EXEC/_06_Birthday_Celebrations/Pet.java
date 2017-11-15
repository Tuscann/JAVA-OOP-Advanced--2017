package _01_Interfaces_EXEC._06_Birthday_Celebrations;

public class Pet implements Identificatable {

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.setName(name);
        this.setBirthdate(birthDate);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
