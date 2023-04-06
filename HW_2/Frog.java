package OOP.HW_OOP.HW_2;

public class Frog extends Reptiles implements Breathable {
    
    public Frog (String name){
        super(name);
    }
    @Override
    public String feed(){
        return " Насекомые ";
    }
    @Override
    public int lengthOfLife(){
        return 6;
    }
    @Override
    public boolean breath(){
        return true;
    }
    
    @Override
    public String toString(){
        return String.format("Подвид: %s\n Название обитателя: %s\n Чем кормить: %s\n Продолжительность жизни: %s\n",
                            clas(), name, feed(), lengthOfLife());
    } 
}
