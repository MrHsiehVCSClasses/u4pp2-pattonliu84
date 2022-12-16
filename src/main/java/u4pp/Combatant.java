package u4pp;

public class Combatant {
    public String name;
    public int maxHealth;
    public int attack;
    public int health;

    //Constructor
 public Combatant(String name, int maxHealth, int attack) {
    this.name = name;
    this.maxHealth = maxHealth;
    this.attack = attack;
    this.health = maxHealth;
}

public String getName() {
    return this.name;
}

public int getHealth() {
    return this.health;
}

public int getMaxHealth() {
    return this.maxHealth;
}

public int getAttackPower() {
    return this.attack;
}

//Prevents health from being negative / above maxHealth
public void setHealth(int health) {
    if (health > maxHealth) {
        this.health = maxHealth;
    }
    else if (health < 0){
        this.health = 0;
    }
    else {
        this.health = health;
    }
}

//Prevents maxhealth from being negative
public void setMaxHealth(int health){
    if (health <= 0){
        this.maxHealth = 1;
    } else {
        this.maxHealth = health;
    } if (this.health > this.maxHealth){
        this.health = maxHealth;
    }
}

//Attack power can't be negative
public void setAttackPower(int attackPower) {
    if (attackPower < 0) {
        attackPower = 0;
    }
    this.attack = attackPower;
}

//Takes in positive damage
public void takeDamage(int damage){
    if (damage >= 0){
        setHealth(health - damage);
    }
}

//Current health above 0, then true
public boolean canFight() {
    if (health <= 0) {
        return false;
    }
        return true;

}

public String toString(){
    return ("The combatant " + name + " " + "with attack " + attack + " " + "has health " + health + " and maximum health " + maxHealth);

}

}
