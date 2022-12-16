package u4pp;
import java.util.Scanner;

public class MonsterFighter {


    public void play (Scanner scanner){

        InputHelper InputHelper = new InputHelper (scanner);
        Monster monsterN = new Monster ("Rock Monster", 5, 1, 1);
        DefenseMonster monsterD = new DefenseMonster ("Hiphop King Kong", 10, 5, 5, 10);
        RandomMonster monsterR = new RandomMonster ("Jazz Demon", 15, 5, 12 );
        Monster [] monsters = {monsterN, monsterD, monsterR};

        System.out.println("Welcome to the game Monster Fighter!");
        System.out.println("Please, if you will, tell us your name");
        String answerName = scanner.nextLine ();
        Fighter player = new Fighter (answerName, 50, 5);
        System.out.println("Welcome to the Monster Fighter!");
        System.out.println(
        "_______  _______  _        _______ _________ _______  _______    _______ _________ _______          _________ _______  _______ \n" +
        "(       )(  ___  )( (    |(  ____ \\\\__   __/(  ____ \\(  ____ )  (  ____ \\\\__   __/(  ____ \\|\\     /|\\__   __/(  ____ \\(  ____ )\n" +
        "| () () || (   ) ||  \\  ( || (    \\/   ) (   | (    \\/| (    )|  | (    \\/   ) (   | (    \\/| )   ( |   ) (   | (    \\/| (    )|\n" +
        "| || || || |   | ||   \\ | || (_____    | |   | (__    | (____)|  | (__       | |   | |      | (___) |   | |   | (__    | (____)|\n" +
        "| |(_)| || |   | || (\\ \\) |(_____  )   | |   |  __)   |     __)  |  __)      | |   | | ____ |  ___  |   | |   |  __)   |     __)\n" +
        "| |   | || |   | || | \\   |      ) |   | |   | (      | (\\ (     | (         | |   | | \\_  )| (   ) |   | |   | (      | (\\ (   \n" +
        "| )   ( || (___) || )  \\  |/\\____) |   | |   | (____/\\| ) \\ \\__  | )      ___) (___| (___) || )   ( |   | |   | (____/\\| ) \\ \\__\n" +
        "|/     \\|(_______)|/    )_)\\_______)   )_(   (_______/|/   \\__/  |/       \\_______/(_______)|/     \\|   )_(   (_______/|/   \\__/");

    while (player.getHealth()>0){
        for (int i = 0; i < monsters.length; i++){
            System.out.println("Do you want to attack [1], block [2], or stack [3]? ")
            String userInput = scanner.next();
            if (userInput.equals ("a")){
                player.attack(monster);
                
            }
        }
    

  





    }
}
