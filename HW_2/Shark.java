package OOP.HW_OOP.HW_2;

public class Shark extends Fish{
    public Shark(String name){
        super(name);
    }
    @Override
    public String feed(){
        return "Мясо";
    }
    @Override
    public int lengthOfLife(){
        return 150;
    }
    
    @Override
    public String toString(){
        return String.format("Подвид: %s\n Название обитателя: %s\n Чем кормить: %s\n Продолжительность жизни: %s\n",
                            clas(), name, feed(), lengthOfLife());
    } 



}
