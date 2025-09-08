//imports util to create ArrayLists
import java.util.ArrayList;
//imports util for user input
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //allows for user to input information
        Scanner userInput = new Scanner(System.in);
        boolean shouldContinue = true;


        while (shouldContinue) {
            System.out.println("Do you want to roll some dice?");
            String diceRoll = userInput.nextLine();

            if (diceRoll.equalsIgnoreCase("yes")) {

                //creates a new ArrayList
                var dice = new ArrayList<String>();
                //takes input and closes the input loop
                System.out.println("How many dice would you like to roll?");
                int timesRolled = userInput.nextInt();

                //takes input and closes the input loop
                System.out.println("How many side do you want your die to have?");
                int dieSide = userInput.nextInt();

                //creates a loop
                for (int i = 0; i < timesRolled; i++) {
                    //creates random number from input
                    int randomNum = (int) ((Math.random() * dieSide) + 1);
                    //adds number rolled to ArrayList
                    dice.add(Integer.toString(randomNum));
                }
                //outputs ArrayList
                System.out.println(dice);
            } else if (diceRoll.equalsIgnoreCase("no")) {
                shouldContinue = false;
                System.out.print("OK... Bye...");
            }
        }
    }
}
