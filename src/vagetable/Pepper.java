package vagetable;

public class Pepper extends Vegetable {

    public Pepper(Integer weight, Integer calories) {
        super(weight, calories);
    }

    @Override
    public void info() {
        System.out.println("Pepper info: " + this);
    }
}
