package vagatableFactory;

import vagetable.*;

public class MediumVegetableFactory extends VegetableFactory {

    @Override
    public Vegetable getVegetable(VegetableType type) {
        return switch (type) {
            case PEPPER -> new Pepper(200, 25);
            case CABBAGE -> new Cabbage(200, 50);
            case ONION -> new Onion(150, 30);
            case TOMATO -> new Tomato(200, 50);
            case CUCUMBER -> new Cucumber(150, 30);
        };
    }
}
