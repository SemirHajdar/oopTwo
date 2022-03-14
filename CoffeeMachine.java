package oopTwo;

public class CoffeeMachine {
    Double spentCapacityOfCoffee;
    Double fullCapacityOfCoffee;
    Double coffeeCapacityInMachine;

    CoffeeMachine(Double coffeeCapacityInMachine, Double spentCapacityOfCoffee, Double fullCapacityOfCoffee) {

        this.spentCapacityOfCoffee = 60.00;
        this.fullCapacityOfCoffee = 100.00;
        this.coffeeCapacityInMachine = coffeeCapacityInMachine;
    }
    public void alertForLowCapacityOfCoffe() {
        if (statusOfCoffeeCapacityInMachine()<50.00) {
            System.out.println("Please Charge your Machine with coffee, it is on: " + statusOfCoffeeCapacityInMachine() + "% of Capacity.");
        }
    }
    private double statusOfCoffeeCapacityInMachine () {
    Double numberA = this.spentCapacityOfCoffee;
    Double numberB = this.spentCapacityOfCoffee;
    Double numberC = this.fullCapacityOfCoffee - this.spentCapacityOfCoffee;

    return numberC;
    }
}

//Enkapsulacija:
//        3. Napraviti CoffeeMachine klasu primjenjujuci koncept enkapsulacije. Potrebno je da klasa sadrzi skup public i private metoda
//        Sam code unutar metoda moze biti jednostavni ispis poruke na System.out.println. Ono sto je bitno je da postoje user facing metode
//        ali i one koje se interno koriste u samoj klasi.