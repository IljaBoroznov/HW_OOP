package OOP.HW_OOP.HW_4;

public class Main {
    public static void main(String[] args) {
        /*
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин Гуд", 100, new Bow(20), new Armor()))
                .addPers(new Archer("Василий", 100, new Bow(15), new Armor()));
        thiefTeam.addPers(new Thief("Джек Потрошитель", 150, new Knife(), new Shield()))
                .addPers(new Thief("Крик", 150, new Knife(), new Shield()));
        //System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        */
        Team<Warrior> team = new Team<>();
        team.addPers(new Archer("Artur", 100, new Bow(20), new Armor()));
        team.addPers(new Thief("Oleg", 150, new Knife(), new Shield()));
        System.out.println(team);
        System.out.println("максимальная защита в команде: " + team.maxProtect());
        /*
        Archer robin = new Archer("Робин Гуд", 50, new Bow(20), new Armor());
        Archer gud = new Archer("Василий", 50, new Bow(50), new Armor());
        Battle fight = new Battle(robin,gud);
        fight.run();
        */
    }
       

}
