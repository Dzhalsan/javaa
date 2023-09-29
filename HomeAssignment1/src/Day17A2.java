import java.util.Random;
import java.util.Scanner;

public class Day17A2 {
    public static void main(String[] args) {

        // task 1

        Scanner scanner = new Scanner(System.in);
//        short currentFloor = 1;
//        int counter = 0;
//        String word = "yes";
//
//        do {
//            System.out.println("You are on the " + currentFloor + "st(th) floor");
//            if (currentFloor==1) System.out.println("Select the flooor you want to go to");
//             else {System.out.println("Do you wanna continue?");
//            word = scanner.next();
//             if (word.equalsIgnoreCase("no")) break;}
//            short tempFloor = currentFloor;
//            currentFloor = scanner.nextShort();
//            if (currentFloor==15 || currentFloor == 23) {
//                System.out.println("Under construction");
//                currentFloor = 1;
//                word = "no";}
//            if (0>=currentFloor || currentFloor>25 ) {
//                System.out.println("Ivalid floor");
//                currentFloor = 1;
//            }
//            if (currentFloor-tempFloor!=0) counter++;
//
//
//        } while (word.equalsIgnoreCase("yes"));
//        System.out.println("Elevator moved " + counter + " times");

        // task 2

        Random random = new Random();
        int compWins = 0;
        int userWins = 0;
        for (int i = 1 ; i<=5 ; i++ ) {
            int computerN = random.nextInt(1, 4);
            System.out.println("Round " + i);
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("rock") || word.equalsIgnoreCase("paper") || word.equalsIgnoreCase("scissors")){
                if (computerN == 1 && word.equalsIgnoreCase("rock")){
                    System.out.println("Computer chooses " + word);
                    System.out.println("Tie");}
                else if (computerN == 1 && word.equalsIgnoreCase("paper")){
                    System.out.println("Computer chooses " + word);
                    userWins++;
                    System.out.println("You won this round");}
                else if (computerN == 1 && word.equalsIgnoreCase("scissors")){
                    System.out.println("Computer chooses " + word);
                    compWins++;
                    System.out.println("Computer wins this round!");}
                else if (computerN == 2 && word.equalsIgnoreCase("paper")){
                    System.out.println("Computer chooses " + word);
                    System.out.println("Tie");}
                else if (computerN == 2 && word.equalsIgnoreCase("scissors")){
                    System.out.println("Computer chooses " + word);
                    userWins++;
                    System.out.println("You won this round");}
                else if (computerN == 2 && word.equalsIgnoreCase("rock")){
                    System.out.println("Computer chooses " + word);
                    compWins++;
                    System.out.println("Computer wins this round");}
                else if (computerN == 3 && word.equalsIgnoreCase("scissors")){
                    System.out.println("Computer chooses " + word);
                    System.out.println("Tie");}
                else if (computerN == 3 && word.equalsIgnoreCase("paper")){
                    System.out.println("Computer chooses " + word);
                    userWins++;
                    System.out.println("You won this round");}
                else if (computerN == 3 && word.equalsIgnoreCase("rock")){
                    System.out.println("Computer chooses " + word);
                    compWins++;
                    System.out.println("Computer wins this round!");}

            }
            else {
                System.out.println("Invalid input");
                i--;
            }
        }
        System.out.println("Game over!");
        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + compWins);



    }
}
