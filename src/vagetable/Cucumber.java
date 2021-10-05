package vagetable;

public class Cucumber extends Vegetable {

    public Cucumber(Integer weight, Integer calories) {
        super(weight, calories);
    }

    @Override
    public void info() {
        System.out.println("Cucumber info: " + this);
    }
}
