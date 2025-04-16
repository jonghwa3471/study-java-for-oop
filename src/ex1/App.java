package ex1;

public class App {
    public static void main(String[] args) {
        ToppingRamyon cheeseRamyon = new ToppingRamyon("치즈");
        cheeseRamyon.boilWater();
        cheeseRamyon.topping();
        cheeseRamyon.cooking();

        ToppingRamyon ricecakeCRamyon = new ToppingRamyon("떡");
        ricecakeCRamyon.boilWater();
        ricecakeCRamyon.topping();
        ricecakeCRamyon.cooking();
    }
}
