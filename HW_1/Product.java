package OOP.HW_OOP.HW_1;

public class Product {
    private String name;
    private int volume;
    private int temperature;
    private int price;

    public Product(String name, int volume, int temperature, int price){
        this.name = name;
        this.temperature = temperature;
        this.volume = volume;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public int getVolume(){
        return this.volume;
    }
    public int getTemperature(){
        return this.temperature;
    }
    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return String.format("%s; объем: %d; температура %d град.; Цена:  %d руб.", 
                             name, volume, temperature, price);                                                 
    }


}
