package OOP.HW_OOP.FinalWork;
import java.util.Scanner;

public class View {
    public static Scanner CompA1 = new Scanner(System.in);
    public static Scanner CompB1 = new Scanner(System.in);
    public static Scanner CompA2 = new Scanner(System.in);
    public static Scanner CompB2 = new Scanner(System.in);
    public static Scanner number = new Scanner(System.in);
        
        public static void start(){
        while (true) {
            System.out.print("Введите число 'A1': ");
            int a1 = CompA1.nextInt();
            System.out.print("Введите число 'B1': ");
            int b1 = CompB1.nextInt();
            System.out.print("Введите число 'A2': ");
            int a2 = CompA2.nextInt();
            System.out.print("Введите число 'B2': ");
            int b2 = CompB2.nextInt();
            Complex C1 = new Complex (a1, b1);
            Complex C2 = new Complex (a2, b2);
            String massage = "Выберите действие с числами:\n 1 - сложить;\n 2 - отнять; ";
            System.out.println(massage);
            int res = number.nextInt();
            if (res == 1) {
                System.out.println("Комплексное число 1 : " + C1.real + " + " + C1.imaginary + "i" +"\n" + 
                                    "Комплексное число 2 : " + C2.real + " + " + C2.imaginary + "i" );
                Complex C3 = new Complex(); 
                C3 = C3.Sum (C1, C2); 
                System.out.println ("Сумма комплексных чисел: " + C3.real + " + " + C3.imaginary + "i");
            }
            if (res == 2) {
                if(C1.imaginary >= C2.imaginary){
                    System.out.println("Комплексное число 1 : " + C1.real + " + " + C1.imaginary + "i" +"\n"+ 
                    "Комплексное число 2 : " + C2.real + " + " + C2.imaginary + "i" );
                    Complex C3 = new Complex(); 
                    C3 = C3.Subt(C1, C2); 
                    System.out.println ("Разность комплексных чисел: " + C3.real + " + " + C3.imaginary + "i");
                }
                else{
                    System.out.println("Комплексное число 1 : " + C1.real + " + " + C1.imaginary + "\n"+ 
                    "Комплексное число 2 : " + C2.real + " + i" + C2.imaginary + "i" );
                    Complex C3 = new Complex(); 
                    C3 = C3.Subt(C1, C2); 
                    System.out.println ("Разность комплексных чисел: " + C3.real + " " + C3.imaginary + "i");
                }
                
            }
            
        }
        }
    
}
