package _01_Interfaces_EXEC._08_Military_Elite.models;


import _01_Interfaces_EXEC._08_Military_Elite.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;

    public PrivateImpl(int id, String name, String lastName, double salary) {
        super(id, name, lastName);
        this.setSalary(salary);
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(String.format(" Salary: %.2f", this.getSalary()));

        return builder.toString();
    }
}
