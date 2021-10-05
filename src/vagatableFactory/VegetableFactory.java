package vagatableFactory;

import vagetable.Vegetable;
import vagetable.VegetableType;

public abstract class VegetableFactory {

    public static VegetableFactory getVegetableFactory(FactoryType type) {
        return switch (type) {
            case LARGE_VEGETABLE -> new LargeVegetableFactory();
            case SMALL_VEGETABLE -> new SmallVegetableFactory();
            case MIDDLE_VEGETABLE -> new MediumVegetableFactory();
        };
    }

    public abstract Vegetable getVegetable(VegetableType type) ;

}
