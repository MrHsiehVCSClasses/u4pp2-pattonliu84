package u4pp;

public class DefenseMonster extends Monster{
    private int monsterDefense;
    public DefenseMonster (String name, int health, int attack, int exp, int defense){
        super(name, health, attack, exp);
        monsterDefense = defense;
        }

    public int getDefense(){
        return monsterDefense;
    }

    //takesDamage, damage has to be greater than the defense for it to work
    public void takeDamage (int damage){
        if (damage - getDefense() > 0){
            int i = damage - getDefense();
        setHealth (health - i);
        } else {
            return;
        }
    }

    public String toString (){
        return "The defense monster " + getName() + "with health " + getHealth() + " and max health " + getMaxHealth() + " has attack power " + getAttackPower() + " with experience given " + getExpGiven() + " and defense" + getDefense();
    }
    
}
