public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Salad summerSalad = SaladFactory.getSummerSalad();
        summerSalad.info();
        Integer summerSaladCalories = summerSalad.getCalories();
        System.out.println("Salad calories: " + summerSaladCalories);
        System.out.println("------------------------------");
        Salad cabbageSalad = SaladFactory.getCabbageSalad();
        cabbageSalad.info();
        Integer cabbageSaladCalories = cabbageSalad.getCalories();
        System.out.println("Salad calories: " + cabbageSaladCalories);
    }
}
