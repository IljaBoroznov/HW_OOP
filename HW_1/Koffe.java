package OOP.HW_OOP.HW_1;

public class Koffe extends Product{
    public Koffe(String name, int volume, int temperature, int price){
        super(name, volume, temperature, price);
    }


    
    @Override
    public String toString(){
        return String.format("Кофе: %s", super.toString());
    }


}
