//imports util to create ArrayLists
import java.util.ArrayList;
//imports util for user input
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //allows for user to input information
        Scanner userInput = new Scanner(System.in);
        boolean shouldContinue = true;
        //creates a new ArrayList
        var dice = new ArrayList<Integer>();
        int timesRolled = 0;
        int dieSide = 0;


        while (shouldContinue) {
            System.out.println("Do you want to roll some dice?");
            String diceRoll = userInput.nextLine();

            if (diceRoll.equalsIgnoreCase("yes")) {

                //takes input and closes the input loop
                System.out.println("How many dice would you like to roll?");
                timesRolled = userInput.nextInt();

                //takes input and closes the input loop
                System.out.println("How many side do you want your die to have?");
                dieSide = userInput.nextInt();

                //creates a loop
                for (int i = 0; i < timesRolled; i++) {
                    //creates random number from input
                    int randomNum = (int) ((Math.random() * dieSide) + 1);
                    //adds number rolled to ArrayList
                    dice.add(randomNum);
                }
                //outputs ArrayList
                System.out.println(dice);
                System.out.println("Would you like to know your lowest or highest roll?");
                String answer = userInput.nextLine();
                if (answer.equalsIgnoreCase("lowest")) {
                    int lowestDie = dice.get(0);
                    for (int die : dice) {
                        if (lowestDie > die) {
                            lowestDie = die;
                        }
                    }
                    System.out.println(lowestDie);
                } else if (answer.equalsIgnoreCase("highest")) {
                    int highestDie = dice.get(timesRolled);
                    for (int die : dice) {
                        if (highestDie < die) {
                            highestDie = die;
                        }
                    }
                    System.out.println(highestDie);
                }else if (diceRoll.equalsIgnoreCase("no")) {
                    shouldContinue = false;
                    System.out.print("OK... Bye...");
                }
                }
            }
        }
    }

