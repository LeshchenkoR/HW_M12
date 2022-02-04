package HW_M12;

import java.util.Objects;

public class Divan {
    private String model;
    private String shape;
    private String mechanism;
    private boolean modularity;
    private String fabricCategory;

    public Divan(String name, String shape, String mechanism, boolean modularity, String fabricCategory) {
        if (name == null || shape == null) {
            throw new IllegalArgumentException();
        }
        this.model = name;
        this.shape = shape;
        this.mechanism = mechanism;
        this.modularity = modularity;
        this.fabricCategory = fabricCategory;
    }

    public String getModel() {
        return model;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getMechanism() {
        return mechanism;
    }

    public boolean isModularity() {
        return modularity;
    }

    public void setModularity(boolean modularity) {
        this.modularity = modularity;
    }

    public String getFabricCategory() {
        return fabricCategory;
    }

    public void setFabricCategory(String fabricCategory) {
        this.fabricCategory = fabricCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, mechanism);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || getClass() != obj.getClass()) return false;
        Divan divan = (Divan) obj;
        return model.equals(divan.model) && shape.equals(divan.shape) && mechanism.equals(divan.mechanism);
    }

    @Override
    public String toString() {
       return String.format("%-15s %-15s %-20s %-15s", model, shape, mechanism, fabricCategory);
    }
}
