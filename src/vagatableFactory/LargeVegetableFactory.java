package vagatableFactory;

import vagetable.*;

public class LargeVegetableFactory extends VegetableFactory {
    @Override
    public Vegetable getVegetable(VegetableType type) {
        return switch (type) {
            case PEPPER -> new Pepper(300, 40);
            case CABBAGE -> new Cabbage(300, 75);
            case ONION -> new Onion(300, 50);
            case TOMATO -> new Tomato(300, 75);
            case CUCUMBER -> new Cucumber(300, 50);
        };
    }
}
