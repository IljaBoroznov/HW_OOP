package OOP.HW_OOP.HW_3;

public class Program {
    public static void main(String[] args) {
        
        MyList<Integer> list = new MyList();
        list.add(5);
        list.add(6);
        list.add(11);
        for (Integer item : list) {
            System.out.println(item);
        }
        
    }
}
