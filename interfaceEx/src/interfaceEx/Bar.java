package interfaceEx;

public abstract class Bar {
	

	public String slogan() {
		return "Our Place";
	}
	
	//Drink will implement Wine and MyBar will extend Bar
	public abstract double costOfBeverage(Drink k);
	

}
