package OOP.HW_OOP.HW_4;

public class Archer extends Warrior<Throwing>{
    public Archer(String name, int hp, Throwing weapon, Armor armor) {
        super(name, hp, weapon, armor);
    }

    public int range(){
        return rnd.nextInt(this.weapon.range)+1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public int protect(){
        return 30;
    }
}
