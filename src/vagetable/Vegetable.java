package vagetable;

public abstract class Vegetable {
    protected Integer calories;
    protected Integer weight;

    public Vegetable(Integer weight, Integer calories) {
        this.calories = calories;
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public abstract void info();

    @Override
    public String toString() {
        return "Calories: " + calories + ", Weight: " + weight + ";" ;
    }
}
