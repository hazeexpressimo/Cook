package vagetable;

public class Cabbage extends Vegetable {

    public Cabbage(Integer weight, Integer calories) {
        super(weight, calories);
    }

    @Override
    public void info() {
        System.out.println("Cabbage info: " + this);
    }
}
