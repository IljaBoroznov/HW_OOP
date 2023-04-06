package OOP.HW_OOP.HW_2;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    
    private List <Habitant> habitants = new ArrayList<>();
    
    public Aquarium(){
        this.habitants = habitants;
    }

    public void addHabitant(Habitant newHabitant){
        this.habitants.add(newHabitant);
    }
    public void showAll(){
        for (Habitant item : this.habitants) {
            System.out.println(item);
        }
    }
    public void showBreathable(){
        List <Habitant> breath = breathables(1);
        for (Habitant item : breath) {
            System.out.println(item);
        }
    }
    public void showNoBreathable(){
        List <Habitant> noBreath = breathables(2);
        for (Habitant item : noBreath) {
            System.out.println(item);
        }
    }

    private List<Habitant> breathables(int a){
        List<Habitant> breath = new ArrayList<>();
        List<Habitant> nobreath = new ArrayList<>();
        for (Habitant item : habitants) {
            if (item instanceof Breathable){
                breath.add((Habitant) item);
            }
            else{
                nobreath.add((Habitant) item);
            }
        }
        if (a == 1){
            return breath;
        }
        else return nobreath;
    }
        
        




}
