package vagetable;

public class Onion extends Vegetable {

    public Onion(Integer weight, Integer calories) {
        super(weight, calories);
    }

    @Override
    public void info() {
        System.out.println("Onion info: " + this);
    }
}
