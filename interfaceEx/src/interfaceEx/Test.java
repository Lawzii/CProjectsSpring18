package interfaceEx;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drink drink = new Drink();
		MyBar myBar = new MyBar();
		
		for (int i = 0; i < 5; i++) {
		System.out.println("Cost is: " + myBar.costOfBeverage(drink));
		}
		

	}

}
