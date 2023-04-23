package OOP.HW_OOP.HW_4;

public class Thief extends Warrior<Knife>{
    public Thief(String name, int hp, Knife weapon, Shield schit) {
        super(name, hp, weapon, schit);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public int protect(){
        return 20;
    }

    
}
