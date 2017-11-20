package _01_Interfaces_EXEC._10_MooD_3;

public abstract class GameObject {
    private String name;
    private String hashedPassword;
    private int level;

    protected GameObject(String username, int level) {
        this.setName(username);
        this.hashedPassword = this.generateHashPassword();
        this.setLevel(level);
    }
    protected abstract String generateHashPassword();

    private void setName(String name) {
        this.name = name;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return this.name;
    }
}
