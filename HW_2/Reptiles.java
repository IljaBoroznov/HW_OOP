package OOP.HW_OOP.HW_2;

public class Reptiles extends Habitant {
    public Reptiles(String name){
        super(name);
    }
    @Override
    public String feed(){
        return "";
    }

    @Override
    public int lengthOfLife(){
        return 0;
    }

    @Override
    public String clas(){
        return "Рептилия";
    }
    
}
