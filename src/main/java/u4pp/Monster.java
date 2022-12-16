package u4pp;

public class Monster extends Combatant {

    private int existMon;

    public Monster(String name, int health, int attack, int exp){
        super(name, health, attack);
        if (exp < 0){
            existMon = 0;
        } else {
            existMon = exp;
        }
    }

    
    public int getExpGiven(){
        return existMon;
    }
//Monster's actions
    public void takeTurn(Combatant target){
        target.takeDamage(getAttackPower());
    }

    public String toString (){
        return getName() + " normal monster " + getAttackPower() + " " + getHealth() + " " + getMaxHealth() + " " + getExpGiven() + " ";
    }

}
    
