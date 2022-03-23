package oopTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class RunnerForNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList();
        Numbers myNumbers = new Numbers(listOfNumbers);

        do {
            myNumbers.menu();
            System.out.println('\n' + "Please enter the number of which action from Menu you want: ");
            int menuNumber = reader.nextInt();

            if (menuNumber == 1) {
                myNumbers.findMinNumber();
            } else if (menuNumber == 2) {
                myNumbers.finMaxNumber();
            } else if (menuNumber == 3) {
                myNumbers.findSumOfNumbers();
            } else if (menuNumber == 4) {
                myNumbers.checkPrimeNumbers();
            } else if (menuNumber == 5) {
                myNumbers.eliminateNonPrimeNumbers();
            } else
                System.out.println("You entered wrong Menu number, Please try again!");
        } while (true);
    }
}
