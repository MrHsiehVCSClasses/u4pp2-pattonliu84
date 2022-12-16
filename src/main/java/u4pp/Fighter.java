package u4pp;

public class Fighter extends Combatant {
private int EXP;
private int focusStacks;
private int level;
private boolean blocking;
//constructors, set default value
public Fighter (String name, int maxHealth, int attack){
    super(name, maxHealth, attack);
    EXP = 0;
    focusStacks = 0;
    level = 1;
    blocking = false;
}
//getters
public int getEXP(){
    return EXP;
}

public int getFocusStacks(){
    return focusStacks;
}

public int getLevel(){
    return level;
}

public boolean getIsBlocking(){
    return blocking;
}

//attacks, the final damage
public void attack (Combatant target){
    int finalDamage = attack;
    for (int i = 0; i < focusStacks; i++){
        finalDamage *=2;
    }
    target.takeDamage(finalDamage);
    focusStacks = 0;

}

//loses health on half the damage. Loses half as much if blocking is true, then sets as false. 
public void takeDamage (int damage){
    if (blocking == true){
        setHealth(getHealth() - (damage/2));
        blocking = false;
    }
    else {
        setHealth (getHealth() - damage);
        blocking = false;
    }
}

public void block(){
    blocking = true;
}

public void focus(){
    focusStacks = focusStacks + 1;
}


public void gainEXP (int exp){
    EXP += exp;
    while (EXP >= level){
        EXP -= level;
        level +=1;
        setMaxHealth(getMaxHealth() + 5);
        setAttackPower(getAttackPower() + 1);
        setHealth(getMaxHealth());
    }
}




public String toString(){
    return ("The fighter " + getName() + " " + "with health" + getHealth() + " " + "has maximum health " + getMaxHealth() + ", attack power " + getAttackPower() + ", level" + level + ", experience" + EXP + ", focus stacks" + focusStacks + "is blocking" + blocking);

}

}
