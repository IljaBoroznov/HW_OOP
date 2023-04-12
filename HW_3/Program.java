package OOP.HW_OOP.HW_3;

public class Program {
    public static void main(String[] args) {
        
        MyList<String> list = new MyList();
        list.add("152585");
        list.add("qwert");
        list.add("asdfg");
        for (String item : list) {
            System.out.println(item);
        }
        
    }
}
