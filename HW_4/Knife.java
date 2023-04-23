package OOP.HW_OOP.HW_4;

public class Knife implements Weapon{
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Кинжал (макс.урон %d)", this.damage());
    }
}
