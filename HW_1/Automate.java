package OOP.HW_OOP.HW_1;
import java.util.ArrayList;
import java.util.List;

public class Automate {
    private List<Product> drinks = new ArrayList<>();
    private int money = 0;
    
    public Automate addProduct(Product product){
        drinks.add(product);
        return this;
    }
    public Product searchProduct(String nameProduct){
        for (Product item: drinks) {
            if(item.getName().equals(nameProduct)){
                return item;
            }
        }
        return null;        
    }
    public Product sell(String name){
        Product target = searchProduct(name);
        if (target != null){
            money += target.getPrice();
            System.out.println("стоимость выбранного напитка " + target.getPrice() + " рубля");
            return target;
        }
        else{
            System.out.println("Такого товара не существуют, попробуйте ещё раз");
            return null;
        }
        
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        for (Product product : drinks) {
            res.append(product);
            res.append("\n");
        }
        res.append(String.format("В атомате %d руб", money));
        return res.toString();
    }
}
