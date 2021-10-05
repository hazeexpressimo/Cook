package vagatableFactory;

import vagetable.*;

public class SmallVegetableFactory extends VegetableFactory {

    @Override
    public Vegetable getVegetable(VegetableType type) {
        return switch (type) {
            case PEPPER -> new Pepper(100, 13);
            case CABBAGE -> new Cabbage(100, 25);
            case ONION -> new Onion(75, 15);
            case TOMATO -> new Tomato(100, 25);
            case CUCUMBER -> new Cucumber(75, 15);
        };
    }
}
