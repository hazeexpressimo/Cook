import vagetable.Vegetable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Salad {

    private String name;
    private final List<Vegetable> vegetables = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void info () {
        System.out.println("Salad name: " + name);
        vegetables.forEach(Vegetable::info);
    }

    public Integer getCalories() {
        int caloriesInSalad = 0;
        for (Vegetable vegetable : vegetables) {
            caloriesInSalad += vegetable.getCalories();
        }
        return caloriesInSalad;
    }

    private void sortByWeight() {
        vegetables.sort(Comparator.comparing(Vegetable::getWeight));
    }

    private Salad() {}

    public static SaladBuilder getSaladBuilder() {
        return new Salad().new SaladBuilder();
    }

    public class SaladBuilder {

        private SaladBuilder () { }

        public SaladBuilder setName(String saladName) {
            Salad.this.name = saladName;
            return this;
        }

        public SaladBuilder addVegetable(Vegetable vegetable) {
            Salad.this.vegetables.add(vegetable);
            return this;
        }

        public Salad buildSalad() {
            sortByWeight();
            return Salad.this;
        }

    }
}
