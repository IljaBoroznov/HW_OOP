package OOP.HW_OOP.HW_1;

public class Program {
    public static void main(String[] args) {
        Automate box = new Automate();
        box.addProduct(new Koffe("Espresso", 50, 80, 2))
            .addProduct(new Tea("Green", 250, 90, 3))
            .addProduct(new Tea("Black", 250, 90, 3))
            .addProduct(new Tea("Milk_Ulun", 250, 80, 5))
            .addProduct(new Koffe("Mokkaccino", 200, 80, 4))
            .addProduct(new Koffe("Cappuccino", 200, 80, 4));
        System.out.println(box);
        box.sell("Espresso");
        box.sell("прол");
        System.out.println(box);
    }
}
