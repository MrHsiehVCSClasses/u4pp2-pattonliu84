package u4pp;

public class Combatant {
    private String name;
    private int maxHealth;
    private int attack;
    private int health;

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

public void setHealth(int health) {
    if (health < 0) {
        this.health = 0;
    }
    else if (health > maxHealth){
        this.health = this.maxHealth;
    }
    this.health = health;
}

public void setMaxHealth(int health){
    if (health <= 0){
        this.health = 1;
    }
    
    if (this.health > this.maxHealth){
        this.health = maxHealth;
    } else {
        this.maxHealth = health;
    }
}

public void setAttackPower(int attackPower) {
    if (attackPower < 0) {
        attackPower = 0;
    }
    this.attack = attackPower;
}

public void takeDamage(int damage){
    if (damage < 0){
        damage = 0;
    }
    else {
        setHealth(this.health - damage);
    }
}

public boolean canFight() {
    if (health <= 0) {
        return false;
    }
        return true;

}

public String toString(){
    return ("The character " + name + " " + "with attack " + attack + " " + "has health " + health + " and maximum health " + maxHealth);

}

}
