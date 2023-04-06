package OOP.HW_OOP.HW_2;

public class Program {
    public static void main(String[] args) {
        Aquarium aqua = new Aquarium();

        aqua.addHabitant(new Frog("Древолаз"));
        aqua.addHabitant(new GoldFish("Петушок"));
        aqua.addHabitant(new Lizard("Ящерка"));
        aqua.addHabitant(new Shark("Акула"));

        //aqua.showAll();
        //aqua.showBreathable();
        aqua.showNoBreathable();


    }
}
