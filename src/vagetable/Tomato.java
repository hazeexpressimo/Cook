package vagetable;

import vagetable.Vegetable;

public class Tomato extends Vegetable {

    public Tomato(Integer weight, Integer calories) {
        super(weight, calories);
    }

    @Override
    public void info() {
        System.out.println("Tomato info: " + this);
    }
}
