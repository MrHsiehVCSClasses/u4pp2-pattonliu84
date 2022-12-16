package u4pp;

public class RandomMonster extends Monster {
     
    public RandomMonster (String name, int health, int attack, int exp){
        super (name, health, attack, exp);
    }
//Hits half the time
    public void takeTurn (Combatant target){
        double rand = Math.random ();
        if (rand > 0.5){
            target.takeDamage(getAttackPower());
        }
    }

    public String toString(){
        return "The random monster who only takes turn 50% of the time " + getName() + " with health " + getHealth() + " and max health: " + getMaxHealth() + " has attack power: " + getAttackPower();
    }
}
