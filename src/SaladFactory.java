import vagatableFactory.FactoryType;
import vagatableFactory.VegetableFactory;
import vagetable.VegetableType;

public class SaladFactory {
    private static final VegetableFactory mediumVegetableFactory = VegetableFactory.getVegetableFactory(FactoryType.MIDDLE_VEGETABLE);
    private static final VegetableFactory smallVegetableFactory = VegetableFactory.getVegetableFactory(FactoryType.SMALL_VEGETABLE);
    private static final VegetableFactory largeVegetableFactory = VegetableFactory.getVegetableFactory(FactoryType.LARGE_VEGETABLE);

    public static Salad getSummerSalad() {
        return Salad.getSaladBuilder()
                .setName("SUMMER SALAD")
                .addVegetable(largeVegetableFactory.getVegetable(VegetableType.TOMATO))
                .addVegetable(mediumVegetableFactory.getVegetable(VegetableType.TOMATO))
                .addVegetable(largeVegetableFactory.getVegetable(VegetableType.CUCUMBER))
                .addVegetable(smallVegetableFactory.getVegetable(VegetableType.ONION))
                .addVegetable(mediumVegetableFactory.getVegetable(VegetableType.PEPPER))
                .buildSalad();
    }

    public static Salad getCabbageSalad() {
        return Salad.getSaladBuilder()
                .setName("CABBAGE SALAD")
                .addVegetable(largeVegetableFactory.getVegetable(VegetableType.CUCUMBER))
                .addVegetable(smallVegetableFactory.getVegetable(VegetableType.ONION))
                .addVegetable(largeVegetableFactory.getVegetable(VegetableType.CABBAGE))
                .addVegetable(mediumVegetableFactory.getVegetable(VegetableType.CABBAGE))
                .addVegetable(largeVegetableFactory.getVegetable(VegetableType.CABBAGE))
                .buildSalad();
    }
}
