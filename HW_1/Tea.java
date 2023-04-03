package OOP.HW_OOP.HW_1;

public class Tea extends Product {
    public Tea(String name, int volume, int temperature, int price){
        super(name, volume, temperature, price);
    }


    @Override
    public String toString(){
        return String.format("Чай: %s", super.toString());
    }
}

