package OOP.HW_OOP.HW_2;

public abstract class Habitant {
    public String name;

    public abstract String feed();
    public abstract int lengthOfLife();
    public abstract String clas();

    public Habitant(String name){
        this.name = name;
    }
}
