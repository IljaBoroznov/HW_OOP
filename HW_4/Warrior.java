package OOP.HW_OOP.HW_4;
import java.util.Random;

    

public abstract class Warrior<T extends Weapon> extends Personage  implements Protection{
protected static Random rnd = new Random();
    protected T weapon;
    protected Protection protect;
    public Warrior(String name, int hp, T weapon, Protection protect) {
        super(name, hp);
        this.weapon = weapon;
        this.protect = protect;
    }
    
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(weapon.damage() + 1);
        }
        if(damage > 0){
            return damage;
        }
        else return 0;
    }
    public int protection(){
        boolean isProtect = rnd.nextBoolean();
        int prot = 0;
        if (isProtect){
            prot = rnd.nextInt(protect.protect()/2 + 1);
        }
        if(prot > 0){
            return prot;
        }
        else return 0;
        
    }

    
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon))
                .append(String.format("\n\tЗащита: %s", this.protect));
        return res.toString();
    }
}

