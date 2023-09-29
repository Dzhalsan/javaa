import java.util.Scanner;

public class Day17A2 {
    public static void main(String[] args) {

//        1. Write a program which is about elevator in
//        a residential building with 25 floors, u can go to any floors,
//                user is gonna floors to go, one he wishes to stop while loop needs to break.
//
//* 15th and 23rd floor are under construction, if one of them is selected, then while loop should stop
//                * if entered floor is wrong like greater than 25 or less than 0, then while loop should stop
//                * Every time before selecting the floor, user must be asked he/she wants to continue yes or no
//
//        You must create this variables int currentFloor outside of the loop,
//        and floorToSelect and String answer inside loop.
//                And you must be able to change your floors, and the while loop stops
//        you must be able to see number how many times has the elevator moved

        Scanner scanner = new Scanner(System.in);
        short[] floors = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        short currentFloor = 1;
        int counter =0;
        String word = "yes";
        System.out.println("You are on the " + currentFloor + "st(th) floor");
        System.out.println("Select the flooor you want to go to");
        currentFloor = scanner.nextShort();
        scanner.nextLine();
        if (currentFloor==15 || currentFloor == 23) {
            System.out.println("Under construction");
            word = "no";
        }



        while (word.equalsIgnoreCase("yes"))
        {
            counter++;
            System.out.println("You are on the " + currentFloor + "st(th) floor");
            System.out.println("Do you want to continue?");
            word = scanner.nextLine();
            scanner.next();
            currentFloor = scanner.nextShort();
            if (currentFloor==15 || currentFloor == 23) {
                System.out.println("Under construction");
                break;
            }



        }
        System.out.println("Elevator moved " + counter + " times");
    }
}
