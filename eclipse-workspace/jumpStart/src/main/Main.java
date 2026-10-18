package main;
import operator.Coffee;
import operator.CoffeMachine;

public class Main {

	public static void main(String[] args) {
		CoffeMachine coffeMachine = new CoffeMachine(400, 540, 120, 9, 550);
		Coffee espresso = new Coffee("Espresso", 50, 0, 16, 4);
		Coffee latte = new Coffee("Lattee", 350, 75, 20, 7);
		Coffee cappuccino = new Coffee("Cappuccino", 200, 100, 12, 6);
		
		coffeMachine.printContents();
		
		coffeMachine.makeCoffee(espresso);
		coffeMachine.makeCoffee(latte);
		coffeMachine.makeCoffee(cappuccino);
		
		coffeMachine.emptyCashregister();
		coffeMachine.fillMachine(200, 100, 50, 5);
		coffeMachine.printContents();
		coffeMachine.printTransactionHistory();
	}

}
