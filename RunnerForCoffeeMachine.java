package oopTwo;

public class RunnerForCoffeeMachine {
    public static void main(String[] args) {

        CoffeeMachine myCoffeeMachine = new CoffeeMachine(0.00, 56.00, 100.00);
        myCoffeeMachine.alertForLowCapacityOfCoffee();
    }
}
