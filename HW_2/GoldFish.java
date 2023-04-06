package OOP.HW_OOP.HW_2;

public class GoldFish extends Fish{
    public GoldFish(String name){
        super(name);
    }
    @Override
    public String feed(){
        return "Воборосли";
    }
    @Override
    public int lengthOfLife(){
        return 7;
    }
    @Override
    public String toString(){
        return String.format("Подвид: %s\n Название обитателя: %s\n Чем кормить: %s\n Продолжительность жизни: %s\n",
                            clas(), name, feed(), lengthOfLife());
}
}
