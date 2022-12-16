package u4pp;

import java.util.Scanner;


public class InputHelper {
    
    Scanner scanner = new Scanner (System.in);
    
    public InputHelper (Scanner scanner){
        this.scanner = scanner;
    }

    public boolean getYesNoInput (String prompt){
        boolean question = true;
        System.out.println(prompt);
        String answer = scanner.nextLine();

        if (answer.charAt(0) == 'y' || answer.charAt(0) == 'Y'){
            question = false;
            return true;
        } else if (answer.charAt(0) == 'n' || answer.charAt(0) == 'N'){
            question = false;
            return false;
        }
        System.out.println("Only Y, y, N, n allowed");

    }

    public int getIntegerInput(String prompt, int min, int max){
        boolean question = true;
        while (question == true){
            System.out.println(prompt);
            int answer = scanner.nextInt();
            String answerString = scanner.nextLine();
            if (answer >= min && answer <= max){
                question = false;
                return answer;
            }
            System.out.println("Try again");
        }
        return -1;
    }
}
