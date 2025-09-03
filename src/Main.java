//imports util to create ArrayLists
import java.util.ArrayList;
//imports util for user input
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creates a new ArrayList
        ArrayList<String> dice = new ArrayList<String>();
//            allows for user to input information
        Scanner userInput = new Scanner(System.in);

//        takes input and closes the input loop
        System.out.println("How many side do you want your die to have?");
        int dieSide = userInput.nextInt();

//        takes input and closes the input loop
        System.out.println("How many dice would you like to roll?");
        int timesRolled = userInput.nextInt();

//        creates a loop
        for (int i = 0; i < timesRolled; i++) {
//            creates random number from input
            int randomNum =  (int) ((Math.random() * dieSide) + 1);
//            adds number rolled to ArrayList
            dice.add(Integer.toString(randomNum));
        }
//        outputs ArrayList
        System.out.println(dice);
    }
}
