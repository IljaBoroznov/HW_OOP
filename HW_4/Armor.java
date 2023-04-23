package OOP.HW_OOP.HW_4;

public class Armor implements Protection {
    
    @Override
    public int protect(){
        return 30;
    }
    @Override
    public String toString() {
        return String.format("Доспехи (макс.защита %d)", this.protect());
    }
}
