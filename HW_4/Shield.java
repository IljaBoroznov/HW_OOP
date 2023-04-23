package OOP.HW_OOP.HW_4;

public class Shield implements Protection {
    
    @Override
    public int protect(){
        return 20;
    }
    @Override
    public String toString() {
        return String.format("Щит (макс.защита %d)", this.protect());
    }
}
