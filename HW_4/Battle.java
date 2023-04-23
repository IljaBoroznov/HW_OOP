package OOP.HW_OOP.HW_4;

public class Battle {
    private Warrior attacker;
    private Warrior defender;

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior run() {
        while (true) {
            int protect1 = defender.protection();
            int attak = attacker.harm();
            int resultAttak1 = attak - protect1;
            if(resultAttak1 < 0){
                resultAttak1 = 0;
            }
            
            defender.reduceHp(resultAttak1);
            System.out.printf("Воин %s наносит %d очков урона, заблокировано %d\nУ воина %s осталось %d hp  \n", 
                attacker.getName(), attak, protect1, defender.getName(), defender.getHp());
            if (!defender.isAlive()){
                System.out.printf("Воин %s погиб\n", defender.getName());
                System.out.printf("Победитель: \n%s", attacker);
                return attacker;
            }
            int protect2 = attacker.protection();
            int response = defender.harm();
            int resultAttak2 = response - protect2;
            if(resultAttak2 < 0){
                resultAttak2 = 0;
            }
            attacker.reduceHp(resultAttak2);
            System.out.printf("Воин %s дал в ответку на %d очков урона, заблокировано %d\nУ воина %s осталось %d hp\n", 
                defender.getName(), response, protect2, attacker.getName(), attacker.getHp());
            if (!attacker.isAlive()){
                System.out.printf("Воин %s погиб\n", attacker.getName());
                System.out.printf("Победитель: \n%s", defender);
                return defender;
            }
        }
    }
}
