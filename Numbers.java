package oopTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

        ArrayList<Integer>  listOfNumbers;

        public Numbers (ArrayList<Integer>listOfNumbers) {
        this.listOfNumbers=listOfNumbers;
}
    private int minNumber (){
            int min= listOfNumbers.get(0);
            int lengthOfArray = listOfNumbers.size();

            for (int i=0; i<lengthOfArray;i++) {
                if (listOfNumbers.get(i) < min) {
                    min = listOfNumbers.get(i);
                }
            } return min;
    }
    private int maxNumber () {
        int max = listOfNumbers.get(0);
        int lengthOfArray = listOfNumbers.size();
        for (int i = 1; i < lengthOfArray; i++) {
            if (listOfNumbers.get(i) > max) {
                max = listOfNumbers.get(i);
            }
        } return max;
    }
    private int sumOfNumber (){
        int sum = 0;
        for (Integer number : listOfNumbers){
            sum = sum + number;
        } return sum;
    }
    private boolean primeNumbers (int number) {
            boolean isPrime = false;
            int i = (int)Math.ceil(Math.sqrt(number));
            while (i > 1) {
                if ((number != i) && (number % i == 0)) {
                    isPrime = false;
                    break;
                } else if (!isPrime)
                    isPrime = true;
                --i;
                } return isPrime;
            }
    public void menu () {
        System.out.println('\n' + "MENU: " + '\n');
        System.out.println("1. MIN number of ArrayList");
        System.out.println("2. MAX number of ArrayList");
        System.out.println("3. SUM numbers of ArrayList");
        System.out.println("4. PRIME numbers Check");
        System.out.println("5. NON PRIME numbers eliminate");

    }
    public void findMinNumber() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList();
        System.out.println("Please enter 5 numbers in Array list: ");
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        Numbers myNumbers = new Numbers(listOfNumbers);
        System.out.println("Min number of list is: " + myNumbers.minNumber());

    }

    public void finMaxNumber() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList();
        System.out.println("Please enter 5 numbers in Array list: ");
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        Numbers myNumbers = new Numbers(listOfNumbers);
        System.out.println("Max number of list is: " + myNumbers.maxNumber());
    }

    public void findSumOfNumbers() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList();
        System.out.println("Please enter 5 numbers in Array list: ");
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        Numbers myNumbers = new Numbers(listOfNumbers);
        System.out.println("Sum of numbers is: " + myNumbers.sumOfNumber());

    }

    public void checkPrimeNumbers() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList();
        System.out.println("Please enter 5 numbers in Array list: ");
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        Numbers myNumbers = new Numbers(listOfNumbers);
        Integer array [] = new Integer [listOfNumbers.size()];
        array = listOfNumbers.toArray(array);
        for (int i = 0; i < array.length; i++) {
            if (myNumbers.primeNumbers(array[i])) {
                System.out.println(array[i] + " Number is prime");
            } else if (!myNumbers.primeNumbers(array[i])) {
                System.out.println(array[i] + " Number is non prime");
            }
        }
    }
    public void  eliminateNonPrimeNumbers () {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList();
        System.out.println("Please enter 5 numbers in Array list: ");
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        listOfNumbers.add(reader.nextInt());
        Numbers myNumbers = new Numbers(listOfNumbers);
        Integer array [] = new Integer [listOfNumbers.size()];
        array = listOfNumbers.toArray(array);
        System.out.println("List with out NON Prime numbers is: ");
        for (int i = 0; i < array.length; i++) {
            if (myNumbers.primeNumbers(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public ArrayList<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }
}


//1. Napraviti klasu Numbers koja ima mogucnost da iz liste brojeva koja je data na inputu izracuna:
//        - min broj
//        - max broj
//        - sum svih brojeva
//        - provjeri da li je broj prost ili ne
//        - provjeri da li ima brojeva u listi koji nisu prosti i te brojeve eliminira iz liste
//        Za ovaj zadatak je potrebno koristiti ArrayList kolekciju