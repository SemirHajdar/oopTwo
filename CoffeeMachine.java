package oopTwo;

public class CoffeeMachine {
    Double spentCapacityOfCoffee;
    Double fullCapacityOfCoffee;
    Double coffeeCapacityInMachine;

    CoffeeMachine(Double coffeeCapacityInMachine, Double spentCapacityOfCoffee, Double fullCapacityOfCoffee) {
        this.spentCapacityOfCoffee = spentCapacityOfCoffee;
        this.fullCapacityOfCoffee = fullCapacityOfCoffee;
        this.coffeeCapacityInMachine = coffeeCapacityInMachine;
    }

    public void alertForLowCapacityOfCoffee() {
        if (statusOfCoffeeCapacityInMachine() < 50.00) {
            System.out.println("Please Charge your Machine with coffee, it is on: " + statusOfCoffeeCapacityInMachine() + "% of Capacity.");
        }
    }

    private double statusOfCoffeeCapacityInMachine() {
        return this.fullCapacityOfCoffee - this.spentCapacityOfCoffee;
    }
}

//Enkapsulacija:
//        3. Napraviti CoffeeMachine klasu primjenjujuci koncept enkapsulacije. Potrebno je da klasa sadrzi skup public i private metoda
//        Sam code unutar metoda moze biti jednostavni ispis poruke na System.out.println. Ono sto je bitno je da postoje user facing metode
//        ali i one koje se interno koriste u samoj klasi.
